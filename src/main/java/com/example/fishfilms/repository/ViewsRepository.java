package com.example.fishfilms.repository;

import com.example.fishfilms.model.entity.ViewsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ViewsRepository extends JpaRepository<ViewsEntity, UUID> {
}
