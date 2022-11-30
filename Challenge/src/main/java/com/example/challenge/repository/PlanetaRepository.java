package com.example.challenge.repository;

import com.example.challenge.model.Planeta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PlanetaRepository extends JpaRepository<Planeta, Long> {

    // Listar planetas
    @Query("SELECT p FROM Planeta p")
    List<Planeta> findAll();

    // Buscar por nome
    Planeta findByNomePlaneta(String nome);

    // Buscar por ID
    @Query("SELECT p FROM Planeta p WHERE p.id = :id")
    Planeta findById(int id);

}
