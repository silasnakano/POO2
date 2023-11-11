package com.uniderp.poo2.ProjetoAPICinemas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.uniderp.poo2.ProjetoAPICinemas.dominio.FilmeAtor;
import com.uniderp.poo2.ProjetoAPICinemas.repositories.FilmeAtorRepository;

@RestController
@RequestMapping(value = "/filme-ator")
public class FilmeAtorController {

    @Autowired
    private FilmeAtorRepository filmeAtorRepository;

    @GetMapping
    public List<FilmeAtor> getObjects() {

        List<FilmeAtor> list = filmeAtorRepository.findAll();

        return list;

    }
    
}
