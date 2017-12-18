package com.seavus.library;

import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.Collection;

@Entity
public class Book {

    @Id
    @GeneratedValue
    Long id ;
    private String title;
    private String isbn;


    @ManyToMany //(mappedBy = "books")
    Collection<Member> members;

    @Autowired
    public Book(){}

    public Book(String title,String isbn){
        this.title = title;
        this.isbn = isbn;
    }

    /*
    public void zdravo(){

        System.out.println("Zz");
    }
    */
}
