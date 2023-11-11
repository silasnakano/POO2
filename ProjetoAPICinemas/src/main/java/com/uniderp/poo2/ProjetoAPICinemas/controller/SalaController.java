package com.uniderp.poo2.ProjetoAPICinemas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.uniderp.poo2.ProjetoAPICinemas.dominio.Sala;
import com.uniderp.poo2.ProjetoAPICinemas.repositories.SalaRepository;

@RestController
@RequestMapping(value = "/sala")
public class SalaController {

    @Autowired
    private SalaRepository salaRepository;

    @GetMapping
    public List<Sala> getObjects() {

        List<Sala> list = salaRepository.findAll();

        return list;

    }
    
}
