package com.cognizant.library.service;

import com.cognizant.library.repository.BookRepository;

public class BookService {

    private BookRepository bookRepository;
    private String libraryName;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
        System.out.println("Constructor Injection Successful");
    }

    public void setLibraryName(String libraryName) {
        this.libraryName = libraryName;
        System.out.println("Setter Injection Successful");
    }

    public void issueBook() {
        System.out.println("Library Name : " + libraryName);
        System.out.println("Book Service: Issuing Book...");
        bookRepository.displayBook();
    }
}