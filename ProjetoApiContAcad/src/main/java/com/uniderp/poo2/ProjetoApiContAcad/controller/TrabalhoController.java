package com.uniderp.poo2.ProjetoApiContAcad.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.uniderp.poo2.ProjetoApiContAcad.dominio.Trabalho;
import com.uniderp.poo2.ProjetoApiContAcad.repositories.TrabalhoRepository;

@RestController
@RequestMapping(value = "/trabalho")
public class TrabalhoController {

    @Autowired
    private TrabalhoRepository trabalhoRepository;

    @GetMapping
    private List<Trabalho> getObjects() {

        List<Trabalho> list = trabalhoRepository.findAll();

        return list;

    }
    
}
