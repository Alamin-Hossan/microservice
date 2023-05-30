package com.example.Order.client;

import com.example.Order.entity.PaymentRequest;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import com.example.Payment.payment.PaymentRequest;

@FeignClient(name = "payment-service")
public interface PaymentServiceClient {
    @PostMapping("/payments")
    void processPayment(@RequestBody PaymentRequest paymentRequest);
}
