package com.example.Payment.controller;

import com.example.Payment.payment.PaymentRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payments")
public class PaymentController {
    @PostMapping
    public void processPayment(@RequestBody PaymentRequest paymentRequest) {
        // Process the payment logic here
    }
}
