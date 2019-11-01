package com.shopping.Services;

import com.shopping.Domain.Book;
import com.shopping.Repository.FreeBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Component
public class FreeBookService {


    private FreeBookRepository freeBookRepository;

    @Autowired
    public FreeBookService(FreeBookRepository freeBookRepository) {
        this.freeBookRepository = freeBookRepository;
    }

    public void save(Book freeBook) {
        freeBookRepository.save(freeBook);

    }

    public Book get(Long id) {
        return freeBookRepository.findById(id).orElse(null);

    }

    public Iterable<Book> list() {
        return freeBookRepository.findAll();
    }


    public void delete(Long id) {
        freeBookRepository.deleteById(id);
    }


    public String addFreeBook(Book freeBook) {
        return "Post";

    }
}
