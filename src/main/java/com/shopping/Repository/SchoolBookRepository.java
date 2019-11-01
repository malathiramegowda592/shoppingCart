package com.shopping.Repository;

import com.shopping.Domain.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SchoolBookRepository extends CrudRepository<Book, Long> {

}




