package com.example.spring6webapp2ndtry.repositories;

import com.example.spring6webapp2ndtry.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book,Long> {
}
