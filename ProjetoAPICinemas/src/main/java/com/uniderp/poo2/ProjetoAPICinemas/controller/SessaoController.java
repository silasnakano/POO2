package com.uniderp.poo2.ProjetoAPICinemas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.uniderp.poo2.ProjetoAPICinemas.dominio.Sessao;
import com.uniderp.poo2.ProjetoAPICinemas.repositories.SessaoRepository;

@RestController
@RequestMapping(value = "/sessao")
public class SessaoController {

    @Autowired
    private SessaoRepository sessaoRepository;

    @GetMapping
    public List<Sessao> getObjects() {

        List<Sessao> list = sessaoRepository.findAll();

        return list;

    } 
    
}
