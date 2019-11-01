package com.shopping.Repository;

import com.shopping.Domain.Book;
import com.shopping.Domain.FreeBook;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository
public interface FreeBookRepository extends CrudRepository<Book, Long> {

    //Iterable<FreeBook> findAll();
    //Optional<FreeBook> findById(Long id);

    }

