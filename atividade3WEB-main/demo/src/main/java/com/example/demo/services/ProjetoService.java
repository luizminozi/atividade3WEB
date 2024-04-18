package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.models.Projeto;
import com.example.demo.repositories.ProjetosRepository;

@Service
public class ProjetoService {

    private final ProjetosRepository projetoRepository;

    @Autowired
    public ProjetoService(ProjetosRepository projetoRepository) {
        this.projetoRepository = projetoRepository;
    }

    public void adicionarProjeto(Projeto projeto) {
        projetoRepository.save(projeto);
    }

    public Projeto buscarProjetoPorId(Long id) {
        return projetoRepository.findProjetoAndFuncionariosById(id);
    }

    public void vincularFuncionario(Long idProjeto, Integer idFuncionario) {
        // Implemente a lógica para vincular um funcionário a um projeto
    }
}
