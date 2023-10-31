package com.uniderp.poo2.ProjetoApiContAcad.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.uniderp.poo2.ProjetoApiContAcad.dominio.Aluno;
import com.uniderp.poo2.ProjetoApiContAcad.repositories.AlunoRepository;

@RestController
@RequestMapping(value = "/aluno")
public class AlunoController {
    
    @Autowired
    private AlunoRepository alunoRepository;
    
    @GetMapping
    public List<Aluno> getObjects() {
        
        List<Aluno> list = alunoRepository.findAll();

        return list;
        
    }

}
