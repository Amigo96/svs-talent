package com.seavus.library;

import org.springframework.web.bind.annotation.*;

import javax.persistence.Transient;
import java.util.ArrayList;
import java.util.Collection;

@RestController
@RequestMapping("/Administrator")
public class AdministratorController {


    @Transient
    BookRepository bookRepository;


    @PostMapping("/books/{bookName}")
    public void registerBook(@PathVariable String bookName,String isbn) {
        // LibraryDB.add(new Book(bookName,isbn));

        bookRepository.save(new Book(bookName,isbn));
    }

    @GetMapping("/books")
    public void listRegisteredBooks() {
        // LibraryDB.listBooks();
      // bookRepository.findAll().forEach(System.out::println);
       // Collection<Book> books = new ArrayList<Book>();
       // return bookRepository.findAll().forEach(x -> books.add(x) );

    }

    @PostMapping("/members/{id}")
    public void createMember(@PathVariable Long id, String name) {
    Member member = new Member(id, name);

    }

    @GetMapping("/members")
    public void memberListing() {

    }


    @GetMapping("/books/{bookName}")
    public void bookLending(@PathVariable String bookName ) {

    }


}
