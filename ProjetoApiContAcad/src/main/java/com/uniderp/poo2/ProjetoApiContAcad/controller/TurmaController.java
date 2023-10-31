package com.uniderp.poo2.ProjetoApiContAcad.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.uniderp.poo2.ProjetoApiContAcad.dominio.Turma;
import com.uniderp.poo2.ProjetoApiContAcad.repositories.TurmaRepository;

@RestController
@RequestMapping(value = "/turma")
public class TurmaController {
    
    @Autowired
    private TurmaRepository turmaRepository;

    @GetMapping
    private List<Turma> getObjects() {

        List<Turma> list = turmaRepository.findAll();

        return list;

    }

}
