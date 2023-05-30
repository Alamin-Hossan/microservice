package com.example.Book.controller;

import com.example.Book.model.Book;
import com.example.Book.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/books")
@RequiredArgsConstructor
public class BookController {
    private final BookService bookService;

    @PostMapping
    public Book createBook(@RequestBody Book book) {
        return bookService.createBook(book);
    }

    @GetMapping("/{id}")
    public Book getBookById(@PathVariable("id") Long id) {
        return bookService.getBookById(id);
    }

    @PutMapping("/{id}/quantity")
    public void updateBookQuantity(@PathVariable("id") Long id, @RequestParam("quantity") int quantity) {
        bookService.updateBookQuantity(id, quantity);
    }

}
