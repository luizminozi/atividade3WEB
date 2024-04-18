package com.example.demo.repositories;

import java.time.LocalDate;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.models.Projeto;

@Repository
public interface ProjetosRepository extends JpaRepository<Projeto, Long> {

    List<Projeto> findByDatainicioBetween(LocalDate dataInicio, LocalDate dataFim);
}