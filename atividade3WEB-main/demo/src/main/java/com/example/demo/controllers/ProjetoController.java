package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.dtos.ProjetoDto;
import com.example.demo.models.Projeto;
import com.example.demo.services.ProjetoService;

@RestController
@RequestMapping("/projetos")
public class ProjetoController {

    private final ProjetoService projetoService;

    @Autowired
    public ProjetoController(ProjetoService projetoService) {
        this.projetoService = projetoService;
    }

    @PostMapping
    public void adicionar(@RequestBody Projeto projeto) {
        projetoService.adicionarProjeto(projeto);
    }

    @GetMapping("/{id}")
    public ProjetoDto buscarProjetoPorId(@PathVariable Integer id) {
        Projeto projeto = projetoService.buscarProjetoPorId(id);
       
    }

    @PostMapping("/{idProjeto}/funcionario/{idFuncionario}")
    public void vincularFuncionario(@PathVariable Long idProjeto, @PathVariable Integer idFuncionario) {
        projetoService.vincularFuncionario(idProjeto, idFuncionario);
    }
}

