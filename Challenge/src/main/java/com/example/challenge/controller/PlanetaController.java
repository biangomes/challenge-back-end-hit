package com.example.challenge.controller;

import com.example.challenge.services.PlanetaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
public class PlanetaController<Planeta> {

    private final PlanetaService servico;

    @Autowired
    public PlanetaController(PlanetaService servico) {
        this.servico = servico;
    }


    @GetMapping("/")
    public ResponseEntity<List<Planeta>> getAll() {
        List<Planeta> planetas = servico.getAll();
        return new ResponseEntity<>(planetas, HttpStatus.OK);
    }
}
