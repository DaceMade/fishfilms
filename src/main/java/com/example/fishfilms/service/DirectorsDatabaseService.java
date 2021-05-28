package com.example.fishfilms.service;

import com.example.fishfilms.model.dto.Director;
import com.example.fishfilms.model.entity.DirectorEntity;
import com.example.fishfilms.model.entity.FilmsEntity;
import com.example.fishfilms.model.entity.UserEntity;
import com.example.fishfilms.model.entity.ViewsEntity;
import com.example.fishfilms.repository.DirectorsRepository;
import com.example.fishfilms.repository.UserRepository;
import com.example.fishfilms.repository.ViewsRepository;
import com.example.fishfilms.service.impl.DirectorService;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

@Service
public class DirectorsDatabaseService implements DirectorService {

    private final DirectorsRepository directorsRepository;

    private final UserRepository userRepository;

    private final ViewsRepository viewsRepository;

    public DirectorsDatabaseService(DirectorsRepository directorsRepository, UserRepository userRepository, ViewsRepository viewsRepository) {
        this.directorsRepository = directorsRepository;
        this.userRepository = userRepository;
        this.viewsRepository = viewsRepository;
    }

    @Override
    public List<Director> getContent() {
        return null;
    }

    @PostConstruct
    public void setup() {
        UserEntity userEntity = UserEntity.builder()
                .isAdmin(false)
                .login("dsgd")
                .password("df")
                .build();
        FilmsEntity test = FilmsEntity.builder()
                .name("asd")
                .genre("safs")
                .year(12)
                .directorId(DirectorEntity.builder().name("df").img("dd").build())
                .img("ds")
                .build();
       ViewsEntity viewsEntity =  ViewsEntity.builder()
                .userId(userEntity)
                .film(test)
                .build();
        //viewsRepository.save(viewsEntity);

    }
}
