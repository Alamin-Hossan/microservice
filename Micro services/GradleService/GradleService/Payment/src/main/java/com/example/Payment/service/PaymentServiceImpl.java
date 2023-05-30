package com.example.Payment.service;

import com.example.Payment.client.UserServiceClient;
import com.example.Payment.exception.NotFoundException;
import com.example.Payment.payment.PaymentRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PaymentServiceImpl implements PaymentService{
    private final UserServiceClient userServiceClient;
    @Override
    public void processPayment(Long userId, Double amount) {
        userServiceClient.updateUserAmount(userId, -amount);
    }

}
