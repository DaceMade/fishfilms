package com.example.fishfilms.repository;

import com.example.fishfilms.model.entity.FilmsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface FilmsRepository extends JpaRepository<FilmsEntity, UUID> {
}
