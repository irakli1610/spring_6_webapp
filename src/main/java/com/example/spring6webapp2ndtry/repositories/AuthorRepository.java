package com.example.spring6webapp2ndtry.repositories;

import com.example.spring6webapp2ndtry.domain.Author;
import org.springframework.data.repository.CrudRepository;
import org.yaml.snakeyaml.events.Event;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
