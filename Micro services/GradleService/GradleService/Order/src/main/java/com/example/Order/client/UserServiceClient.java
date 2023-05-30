package com.example.Order.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.example.Book.model.Book;

@FeignClient(name = "user-service")
public interface UserServiceClient {
    @RequestMapping("/users/{id}/amount")
    void updateUserAmount(@PathVariable("id") Long id, @RequestParam("amount") double amount);

}
