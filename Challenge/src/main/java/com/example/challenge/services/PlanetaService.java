package com.example.challenge.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.challenge.repository.PlanetaRepository;

@Service
public class PlanetaService<Planeta> {

    private final PlanetaRepository planetaRepository;

    // Utilizando injeção de dependência
    @Autowired
    public PlanetaService(PlanetaRepository planetaRepository) {
        this.planetaRepository = planetaRepository;
    }
}
