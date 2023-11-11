package com.uniderp.poo2.ProjetoAPICinemas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.uniderp.poo2.ProjetoAPICinemas.dominio.Ingresso;
import com.uniderp.poo2.ProjetoAPICinemas.repositories.IngressoRepository;

@RestController
@RequestMapping(value = "/ingresso")
public class IngressoController {

    @Autowired
    private IngressoRepository ingressoRepository;

    @GetMapping
    public List<Ingresso> getObjects() {

        List<Ingresso> list = ingressoRepository.findAll();

        return list;

    }
    
}
