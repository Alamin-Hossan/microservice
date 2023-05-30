package com.example.Order.entity;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Book {
    private Long id;
    private String name;
    private double price;
    private String description;
    private int quantity;

}
