package com.example.fishfilms.service;

import com.example.fishfilms.model.entity.UserEntity;

public interface UserService {
    void saveNewUser(String name);

    UserEntity getUserByName(String name);
}
