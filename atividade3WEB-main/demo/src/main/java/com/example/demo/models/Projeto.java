package com.example.demo.models;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Projeto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String descricao;

    private LocalDate datainicio;

    private LocalDate datafim;

    @ManyToMany(mappedBy="Projeto")
    private List<Funcionario> funcionarios;

    public Projeto() {
    }

    public Projeto(String descricao, LocalDate datainicio, LocalDate datafim) {
        this.descricao = descricao;
        this.datainicio = datainicio;
        this.datafim = datafim;
    }

    @Override
    public String toString() {
        return "Projeto [id=" + id + ", descricao=" + descricao + ", datainicio=" + datainicio + ", datafim=" + datafim
                + "]";
    }

}
