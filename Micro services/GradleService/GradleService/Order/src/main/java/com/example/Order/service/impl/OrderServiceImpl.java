package com.example.Order.service.impl;

import com.example.Order.client.BookServiceClient;
import com.example.Order.client.UserServiceClient;
import com.example.Order.entity.Order;
import com.example.Order.repository.OrderRepository;
import com.example.Order.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;


@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {
    private final OrderRepository orderRepository;
    private final BookServiceClient bookServiceClient;
    private final UserServiceClient userServiceClient;

    @Override
    @Transactional
    public void placeOrder(Order order) {
        double totalPrice = order.getQuantity() * bookServiceClient.getBookById(order.getBookId()).getPrice();
        userServiceClient.updateUserAmount(order.getUserId(), -totalPrice);
        bookServiceClient.updateBookQuantity(order.getBookId(), -order.getQuantity());
        orderRepository.save(order);

    }
}
