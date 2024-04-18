package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.models.Funcionario;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Integer> {
        List<Funcionario> findByNomeLike(Integer id);
        }