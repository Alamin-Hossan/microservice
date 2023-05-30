package com.example.Book.service;

import com.example.Book.model.Book;

public interface BookService {

    Book createBook(Book book);
    Book getBookById(Long id);
    void updateBookQuantity(Long id, int quantity);
}
