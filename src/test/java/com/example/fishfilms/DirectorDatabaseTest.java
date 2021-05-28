package com.example.fishfilms;

import com.example.fishfilms.model.entity.DirectorEntity;
import com.example.fishfilms.repository.DirectorsRepository;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.UUID;


@SpringBootTest
public class DirectorDatabaseTest {

    @Autowired
    private DirectorsRepository directorsRepository;

    private UUID testUuid;

    private DirectorEntity testEntity;


    @BeforeEach
    void setUp() {
        testUuid = UUID.randomUUID();
        testEntity = DirectorEntity.builder().name(testUuid.toString()).img("testimage").build();
    }

    @Test
    public void addingTest() {
        directorsRepository.save(testEntity);
        List<DirectorEntity> expectedEntity = directorsRepository.findAllByNameAndImg(testUuid.toString(), "testimage");
        Assert.assertEquals(expectedEntity.get(0).getId(), testEntity.getId());
        //directorsRepository.deleteAll();
    }
}
