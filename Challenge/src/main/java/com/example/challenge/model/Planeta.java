package com.example.challenge.model;

import javax.persistence.*;

@Entity
public class Planeta {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable=false, updatable=false)
    private Long id;
    private String nome;
    private String clima;
    private String terreno;

    public Planeta() {}

    public Planeta(Long id, String nome, String clima, String terreno) {
        this.id = id;
        this.nome = nome;
        this.clima = clima;
        this.terreno = terreno;
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getClima() {
        return clima;
    }

    public void setClima(String clima) {
        this.clima = clima;
    }

    public String getTerreno() {
        return terreno;
    }

    public void setTerreno(String terreno) {
        this.terreno = terreno;
    }

    @Override
    public String toString() {
        return "Nome do planta: " + getNome() + "\nClima: " + getClima() + "\nTerreno: " + getTerreno();
    }
}
