package com.seavus.library;

import com.seavus.library.unnecessary.LibraryDB;
import org.springframework.data.repository.CrudRepository;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Administrator extends Employee implements AdministratorLibrary {
   /* @Id
    @GeneratedValue
    private Long id;*/
    BookRepository bookRepository;


    public Administrator(){
        super();
    }


    @Override
    public void registerBook(String bookName, String isbn) {
       // LibraryDB.add(new Book(bookName,isbn));

        bookRepository.save(new Book(bookName,isbn));
    }

    @Override
    public void listRegisteredBooks() {
   // LibraryDB.listBooks();
    bookRepository.findAll().forEach(System.out::println);
    }

    @Override
    public void memberRegistration() {

    }

    @Override
    public void memberListing() {

    }

    @Override
    public void bookLending() {

    }
}
