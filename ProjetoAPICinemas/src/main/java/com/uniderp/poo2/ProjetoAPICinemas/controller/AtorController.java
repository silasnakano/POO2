package com.uniderp.poo2.ProjetoAPICinemas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.uniderp.poo2.ProjetoAPICinemas.dominio.Ator;
import com.uniderp.poo2.ProjetoAPICinemas.repositories.AtorRepository;

@RestController
@RequestMapping(value = "/ator")
public class AtorController {

    @Autowired
    private AtorRepository atorRepository;

    @GetMapping
    public List<Ator> getObjects() {

        List<Ator> list = atorRepository.findAll();

        return list;

    }
    
}
