package com.shopping.Controller;

import com.shopping.Services.SchoolBookServices;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class SchoolBookController {

    private SchoolBookServices schoolBookServices;

    public SchoolBookController(SchoolBookServices schoolBookServices) {
        this.schoolBookServices = schoolBookServices;
    }

    @GetMapping("/schoolBook/{id}")
    public String showSchoolBookId(Model model, @PathVariable(value = "id") Long id) {
        model.addAttribute("book", schoolBookServices.getId(id));
        return "freebook";
    }

    @GetMapping("/schoolBook")
    public String showAllSchoolBook(Model model) {
        model.addAttribute("books", schoolBookServices.GetList());
        return "list";
    }
}
