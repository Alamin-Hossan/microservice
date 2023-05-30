package com.example.Payment.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "user-service")
public interface UserServiceClient {
    @PutMapping("/users/{id}/amount")
    void updateUserAmount(@PathVariable("id") Long id, @RequestParam("amount") Double amount);
}
