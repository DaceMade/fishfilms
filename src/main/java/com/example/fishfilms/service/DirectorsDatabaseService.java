package com.example.fishfilms.service;

import com.example.fishfilms.model.dto.Director;
import com.example.fishfilms.model.entity.DirectorEntity;
import com.example.fishfilms.repository.DirectorsRepository;
import com.example.fishfilms.service.impl.DirectorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

@Service
public class DirectorsDatabaseService implements DirectorService {

    private final DirectorsRepository directorsRepository;

    public DirectorsDatabaseService(DirectorsRepository directorsRepository) {
        this.directorsRepository = directorsRepository;
    }

    @Override
    public List<Director> getContent() {
        return null;
    }

    @PostConstruct
    public void setup() {

    }
}
