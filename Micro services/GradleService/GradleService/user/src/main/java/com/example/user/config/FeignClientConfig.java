package com.example.user.config;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Configuration
@FeignClient(name = "user-service")
public interface FeignClientConfig {
    @PutMapping("/users/{id}/amount")
    void updateUserAmount(@PathVariable("id") Long id, @RequestParam("amount") double amount);
}
