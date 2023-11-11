package com.uniderp.poo2.ProjetoAPICinemas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uniderp.poo2.ProjetoAPICinemas.dominio.Filme;

public interface FilmeRepository extends JpaRepository<Filme, Long> {
    
}
