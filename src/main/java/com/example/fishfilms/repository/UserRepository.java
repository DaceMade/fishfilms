package com.example.fishfilms.repository;

import com.example.fishfilms.model.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, UUID> {
    boolean existsUserEntityByLogin(String login);
    UserEntity findByLogin(String login);
}
