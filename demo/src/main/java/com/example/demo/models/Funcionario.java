package com.example.demo.models;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Funcionario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nome;

    @ManyToOne
    @JoinColumn(name = "Setor_id")
    private Setor setor;


    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name="SETOR_FUNCIONARIO",
    joinColumns={@JoinColumn(name="SETOR_ID")}, 
    inverseJoinColumns={@JoinColumn(name="FUNCIONARIO_ID")})
    private List<Projeto> projetos;


    public Funcionario() {
    }

    public Funcionario(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Funcionario [id=" + id + ", nome=" + nome + "]";
    }

}
