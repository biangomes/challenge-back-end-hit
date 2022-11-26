package com.example.challenge.controller;

import com.example.challenge.services.PlanetaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class PlanetaController<Planeta> {

    private final PlanetaService servico;

    @Autowired
    public PlanetaController(PlanetaService servico) {
        this.servico = servico;
    }

}
