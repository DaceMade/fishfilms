package com.example.fishfilms.service;

import com.example.fishfilms.model.entity.FilmsEntity;
import com.example.fishfilms.model.entity.UserEntity;

public interface ViewService {
    void saveView(FilmsEntity filmsEntity, UserEntity userEntity);
}
