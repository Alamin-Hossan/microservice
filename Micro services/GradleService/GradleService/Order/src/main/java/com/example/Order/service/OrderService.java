package com.example.Order.service;

import com.example.Order.entity.Order;

public interface OrderService {
    void placeOrder(Order order);
//    void rollbackOrder(Order order);
}
