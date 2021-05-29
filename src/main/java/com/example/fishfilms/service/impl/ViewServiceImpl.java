package com.example.fishfilms.service.impl;

import com.example.fishfilms.model.entity.FilmsEntity;
import com.example.fishfilms.model.entity.UserEntity;
import com.example.fishfilms.model.entity.ViewsEntity;
import com.example.fishfilms.repository.ViewsRepository;
import com.example.fishfilms.service.ViewService;
import org.springframework.stereotype.Service;

@Service
public class ViewServiceImpl implements ViewService {

    ViewsRepository viewsRepository;

    public ViewServiceImpl(ViewsRepository viewsRepository) {
        this.viewsRepository = viewsRepository;
    }


    @Override
    public void saveView(FilmsEntity filmsEntity, UserEntity userEntity) {
        ViewsEntity viewsEntity =  ViewsEntity.builder()
                .userId(userEntity)
                .film(filmsEntity)
                .build();
        viewsRepository.save(viewsEntity);
    }
}
