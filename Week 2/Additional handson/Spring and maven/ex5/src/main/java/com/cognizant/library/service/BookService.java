package com.cognizant.library.service;

import com.cognizant.library.repository.BookRepository;

public class BookService {

    private BookRepository bookRepository;

    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void issueBook() {
        System.out.println("Book Service: Issuing Book...");
        bookRepository.displayBook();
    }
}