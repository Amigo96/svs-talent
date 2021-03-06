package com.seavus.library.unnecessary;

import org.springframework.data.repository.CrudRepository;

public interface AdministratorLibrary {

    void registerBook(String bookName, String isbn);
    void listRegisteredBooks();
    void memberRegistration();
    void memberListing();
    void bookLending();
}
