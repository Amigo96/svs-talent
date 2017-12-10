package com.seavus.library.unnecessary;

import com.seavus.library.Book;

import java.util.ArrayList;

public  class LibraryDB {
   static ArrayList<Book>  books = new ArrayList<Book>();


   public LibraryDB(){
       books = new ArrayList<Book>();
   }



   public static void add(Book book){
       books.add(book);

   }

   public static void listBooks(){
       books.stream().forEach(System.out::println);
   }

}
