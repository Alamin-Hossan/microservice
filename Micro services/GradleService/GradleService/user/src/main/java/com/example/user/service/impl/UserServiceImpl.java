package com.example.user.service.impl;

import com.example.user.entities.User;
import com.example.user.repository.UserRepository;
import com.example.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    @Autowired
    private final UserRepository userRepository;

    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User getUserById(Long id) {
        return (User) userRepository.findById(id).orElse(null);
    }

    @Override
    public void updateUserAmount(Long id, double amount) {
        User user = (User) userRepository.findById(id).orElse(null);
        if (user!=null){
            user.setAmount(amount);
            userRepository.save(user);
        }

    }
}
