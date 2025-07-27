package com.example.nplus1test.domain.country.repository;

import com.example.nplus1test.domain.country.entity.CountryEntity;
import com.example.nplus1test.domain.country.entity.IngredientEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface IngredientRepository extends JpaRepository<IngredientEntity, Long> {
    Optional<IngredientEntity> findByIngredient(String ingredient);



}
