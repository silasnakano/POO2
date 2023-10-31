package com.uniderp.poo2.ProjetoApiContAcad.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.uniderp.poo2.ProjetoApiContAcad.dominio.Disciplina;
import com.uniderp.poo2.ProjetoApiContAcad.repositories.DisciplinaRepository;

@RestController
@RequestMapping(value = "/disciplina")
public class DisciplinaController {
    
    @Autowired
    private DisciplinaRepository disciplinaRepository;

    @GetMapping
    public List<Disciplina> getObjects() {
         
        List<Disciplina> list = disciplinaRepository.findAll();

        return list;
    }

}
