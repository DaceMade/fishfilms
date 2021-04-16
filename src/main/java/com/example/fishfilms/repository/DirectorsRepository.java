package com.example.fishfilms.repository;

import com.example.fishfilms.model.entity.DirectorEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;

@Repository
public interface DirectorsRepository extends JpaRepository<DirectorEntity, UUID> {
    List<DirectorEntity> findAllByNameAndImg(String name, String img);

    void deleteByImg(String img);

    long deleteByName(String name);
}
