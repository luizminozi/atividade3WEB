package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dtos.ProjetoDto;
import com.example.demo.models.Funcionario;
import com.example.demo.repositories.FuncionarioRepository;

@Service
public class FuncionarioService {

    private final FuncionarioRepository funcionarioRepository;

    @Autowired
    public FuncionarioService(FuncionarioRepository funcionarioRepository) {
        this.funcionarioRepository = funcionarioRepository;
    }

    public void adicionarFuncionario(Funcionario funcionario) {
        funcionarioRepository.save(funcionario);
    }

    public List<ProjetoDto> buscarProjetos(Integer idFuncionario) {
        return null;
        // Implemente a lógica para buscar os projetos de um funcionário
    }
}

