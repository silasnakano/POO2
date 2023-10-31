package com.uniderp.poo2.ProjetoApiContAcad.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uniderp.poo2.ProjetoApiContAcad.dominio.Professor;

public interface ProfessorRepository extends JpaRepository<Professor, Long>{
    
}
