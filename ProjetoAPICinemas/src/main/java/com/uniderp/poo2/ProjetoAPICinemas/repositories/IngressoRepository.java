package com.uniderp.poo2.ProjetoAPICinemas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uniderp.poo2.ProjetoAPICinemas.dominio.Ingresso;

public interface IngressoRepository extends JpaRepository<Ingresso, Long> {
    
}
