package com.shopping.Controller;

import com.shopping.Domain.Book;
import com.shopping.Services.FreeBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class FreeBookController {

    @Autowired
    private FreeBookService freeBookService;

    public FreeBookController(FreeBookService freeBookService) {
        this.freeBookService = freeBookService;
    }

    @GetMapping("/freeBook/{id}")
        public String getFreebookById(Model model, @PathVariable(value="id") Long id){
        model.addAttribute("book", freeBookService.get(id));
        return "freebook";
    }


    @RequestMapping("/freeBook")
   //@ResponseBody
    public String showAllFreeBook(Model model){
        model.addAttribute("books", freeBookService.list());
        return "list";
    }

    @RequestMapping("/freeBookdelete/{id}")
    @ResponseBody
    public void deleteFreeBook(@PathVariable Long id){
        freeBookService.delete(id);
    }
    @RequestMapping(method= RequestMethod.POST, value="/freeBook")
    @ResponseBody
    public String addFreeBook( @RequestBody Book freeBook){
       return freeBookService.addFreeBook(freeBook);
    }
}
