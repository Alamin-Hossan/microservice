package com.example.Order.client;

import com.example.Book.model.Book;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;


@FeignClient(name = "book-service")
public interface BookServiceClient {

    @GetMapping("/books/{id}")
    Book getBookById(@PathVariable("id") Long id);

    @PutMapping("/books/{id}/quantity")
    void updateBookQuantity(@PathVariable("id") Long id, @RequestParam("quantity") int quantity);
}
