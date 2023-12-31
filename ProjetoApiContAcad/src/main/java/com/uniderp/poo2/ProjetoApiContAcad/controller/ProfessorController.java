package com.uniderp.poo2.ProjetoApiContAcad.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.uniderp.poo2.ProjetoApiContAcad.dominio.Professor;
import com.uniderp.poo2.ProjetoApiContAcad.repositories.ProfessorRepository;

@RestController
@RequestMapping(value = "/professor")
public class ProfessorController {

    @Autowired
    private ProfessorRepository professorRepository;
    
    @GetMapping
    public List<Professor> getObjects() {
        
        List<Professor> list = professorRepository.findAll();

        return list;
    }

}
