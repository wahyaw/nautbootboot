package com.example.service;


import com.example.dto.UserRequestDto;
import com.example.entity.UserEntity;
import com.example.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UserEntity save(UserRequestDto userRequestDto) {
        return userRepository.save(new UserEntity(userRequestDto.getUsername(), userRequestDto.getPassword()));
    }

    public List<UserEntity> getAllUsers() {
        return userRepository.findAll();
    }
}
