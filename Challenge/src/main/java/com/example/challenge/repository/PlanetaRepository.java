package com.example.challenge.repository;

import com.example.challenge.model.Planeta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PlanetaRepository extends JpaRepository<Planeta, Long> {
    @Query("SELECT p FROM Planeta p")
    List<Planeta> findAll();

    Planeta findByNomePlaneta(String nome);

    @Query(value = "INSERT INTO Planeta (nome, clima, terreno) VALUES (:nome, :clima, :terreno)", nativeQuery = true)
    Integer insertPlaneta(String nome, String clima, String terreno);
}
