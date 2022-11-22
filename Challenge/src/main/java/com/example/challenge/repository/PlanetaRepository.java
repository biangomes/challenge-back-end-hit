package com.example.challenge.repository;

import com.example.challenge.model.Planeta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PlanetaRepository extends JpaRepository<Planeta, Long> {

    List<Planeta> findAll();

    Planeta findByNomePlaneta(String nome);
}
