package com.example.spring6webapp2ndtry.bootstrap;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.example.spring6webapp2ndtry.domain.Author;
import com.example.spring6webapp2ndtry.domain.Book;
import com.example.spring6webapp2ndtry.repositories.AuthorRepository;
import com.example.spring6webapp2ndtry.repositories.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {


    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;

    public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        Author irakli = new Author();
        irakli.setFirstName("irakli");
        irakli.setLastName("developer");

        Book ddd = new Book();
        ddd.setTitle("Domain Driven Design");
        ddd.setIsbn("6546512");

        Author irakliSaved = authorRepository.save(irakli);
        Book dddSaved= bookRepository.save(ddd);


        Author murad = new Author();
        irakli.setFirstName("murad");
        irakli.setLastName("tester");

        Book testing = new Book();
        ddd.setTitle("intro to testing");
        ddd.setIsbn("6419512");

        Author muradSaved = authorRepository.save(murad);
        Book testingSaved= bookRepository.save(testing);

        irakliSaved.getBooks().add(dddSaved);
        muradSaved.getBooks().add(testingSaved);

        System.out.println("In Bootstrap");

    }
}
