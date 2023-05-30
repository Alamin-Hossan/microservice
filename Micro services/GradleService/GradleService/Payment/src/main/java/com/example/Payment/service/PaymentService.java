package com.example.Payment.service;

import com.example.Payment.payment.PaymentRequest;

public interface PaymentService {
    void processPayment(Long userId, Double amount);
}
