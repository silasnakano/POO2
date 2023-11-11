package com.uniderp.poo2.ProjetoAPICinemas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uniderp.poo2.ProjetoAPICinemas.dominio.Sala;

public interface SalaRepository extends JpaRepository<Sala, Long> {
    
}
