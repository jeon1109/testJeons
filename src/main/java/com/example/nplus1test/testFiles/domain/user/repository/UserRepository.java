package com.example.nplus1test.testFiles.domain.user.repository;

import com.example.nplus1test.testFiles.domain.user.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Long> {

}
