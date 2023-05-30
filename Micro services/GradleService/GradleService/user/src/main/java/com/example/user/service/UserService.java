package com.example.user.service;

import com.example.user.entities.User;

public interface UserService {

    User createUser(User user);
    User getUserById(Long id);
    void updateUserAmount(Long id, double amount);

}
