package com.example.fishfilms.service.impl;

import com.example.fishfilms.model.entity.UserEntity;
import com.example.fishfilms.repository.UserRepository;
import com.example.fishfilms.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @Override
    public void saveNewUser(String name) {
        if (!userRepository.existsUserEntityByLogin(name)){
            UserEntity userEntity = UserEntity.builder()
                    .isAdmin(false)
                    .login(name)
                    .password("O2auth type")
                    .build();
            userRepository.save(userEntity);
        }
    }

    public UserEntity getUserByName(String name) {
        return userRepository.findByLogin(name);
    }
}
