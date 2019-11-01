package com.shopping.Services;

import com.shopping.Domain.Book;
import com.shopping.Repository.SchoolBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Iterator;

@Service
public class SchoolBookServices {

    @Autowired
    private SchoolBookRepository schoolBookRepository;

    public SchoolBookServices(SchoolBookRepository schoolBookRepository) {
        this.schoolBookRepository = schoolBookRepository;
    }

    public void save(Book schoolbook) {
        schoolBookRepository.save(schoolbook);

    }

    public Book getId(Long id) {
        return schoolBookRepository.findById(id).orElse(null);

    }

    public void update(String name,Book schoolbook){
        schoolBookRepository.save(schoolbook);
    }

    public Iterable<Book> GetList() {

        return schoolBookRepository.findAll();
    }

}
