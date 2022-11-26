package com.example.challenge.services;

import com.example.challenge.repository.PlanetaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlanetaService<Planeta>{

    private final PlanetaRepository repo;

    @Autowired
    public PlanetaService(PlanetaRepository repo) {
        this.repo = repo;
    }

    public List<Planeta> getAll() {
        return (List<Planeta>) repo.findAll();
    }


}
