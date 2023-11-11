package com.uniderp.poo2.ProjetoAPICinemas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uniderp.poo2.ProjetoAPICinemas.dominio.Sessao;

public interface SessaoRepository extends JpaRepository<Sessao, Long> {
    
}
