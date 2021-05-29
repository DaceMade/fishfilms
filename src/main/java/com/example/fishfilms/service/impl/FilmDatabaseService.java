package com.example.fishfilms.service.impl;

import com.example.fishfilms.repository.FilmsRepository;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class FilmDatabaseService {


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
