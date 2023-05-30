package com.example.Book.service.impl;

import com.example.Book.model.Book;
import com.example.Book.repository.BookRepository;
import com.example.Book.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;

    @Override
    public Book createBook(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public Book getBookById(Long id) {
        return bookRepository.findById(id).orElse(null);
    }

    @Override
    public void updateBookQuantity(Long id, int quantity) {
        Book book = bookRepository.findById(id).orElse(null);
        if (book != null) {
            book.setQuantity(quantity);
            bookRepository.save(book);
        }
    }
}
