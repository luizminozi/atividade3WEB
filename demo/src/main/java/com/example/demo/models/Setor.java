package com.example.demo.models;


import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Setor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nome;

    @OneToMany(mappedBy = "Setor")
    private List<Funcionario> Funcionarios;

    public Setor() {
    }

    public Setor(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Setor [id=" + id + ", nome=" + nome + "]";
    }

}
