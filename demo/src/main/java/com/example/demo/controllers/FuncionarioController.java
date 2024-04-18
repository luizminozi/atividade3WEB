package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.demo.models.Funcionario;
import com.example.demo.services.FuncionarioService;

@RestController
@RequestMapping("/funcionarios")
public class FuncionarioController {

    private final FuncionarioService funcionarioService;

    @Autowired
    public FuncionarioController(FuncionarioService funcionarioService) {
        this.funcionarioService = funcionarioService;
    }

    @PostMapping
    public void adicionar(@RequestBody Funcionario funcionario) {
        funcionarioService.adicionarFuncionario(funcionario);
    }

    @GetMapping("/{id}/projetos")
    public List<DadosProjetoDto> buscarProjetos(@PathVariable Integer id) {
        return funcionarioService.buscarProjetos(id);
    }
}


