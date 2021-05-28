package com.example.fishfilms.service;

import com.example.fishfilms.model.entity.DirectorEntity;
import com.example.fishfilms.model.entity.FilmsEntity;
import com.example.fishfilms.repository.DirectorsRepository;
import com.example.fishfilms.repository.FilmsRepository;
import com.example.fishfilms.service.impl.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.LinkedList;

@Service
public class FilmDatabaseService implements FilmService {


    private final FilmsRepository filmsRepository;

    public FilmDatabaseService(FilmsRepository filmsRepository) {
        this.filmsRepository = filmsRepository;
    }

    @PostConstruct
    private void setup(){
//        ArrayList<DirectorEntity> directorEntities = new ArrayList<>();
//        filmsRepository.deleteAll();
//        directorEntities.add(DirectorEntity.builder().name("df").img("dd").build());
//        FilmsEntity test = FilmsEntity.builder()
//                .name("asd")
//                .genre("safs")
//                .year(12)
//                .directorId(DirectorEntity.builder().name("df").img("dd").build())
//                .img("ds")
//                .build();
//        filmsRepository.save(test);
    }
}
