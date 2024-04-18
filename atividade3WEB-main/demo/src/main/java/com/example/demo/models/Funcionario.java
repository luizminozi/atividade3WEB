package com.example.demo.models;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity
@Data
@AllArgsConstructor
@Getter     
@Setter
@NoArgsConstructor
public class Funcionario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(length = 200, nullable = false)
    private String nome;
    @Column(nullable = false)
    private int cargaHoraria;
    @ManyToOne
    @JoinColumn(name = "Setor_id")
    private Setor setor;


    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name="SETOR_FUNCIONARIO",
    joinColumns={@JoinColumn(name="SETOR_ID")}, 
    inverseJoinColumns={@JoinColumn(name="FUNCIONARIO_ID")})
    private List<Projeto> projetos;


    public Funcionario(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Funcionario [id=" + id + ", nome=" + nome + "]";
    }

}
