package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.models.Setor;

    public interface SetorRepository extends JpaRepository<Setor, Integer> {
        @Query("select cc from CategoriaCurso cc left join fetch cc.cursos c where cc.id = :id ")
        Setor findSetorFetchFuncionarios(@Param("id") Long id);

}
