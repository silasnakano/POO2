package com.uniderp.poo2.ProjetoApiContAcad.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.uniderp.poo2.ProjetoApiContAcad.dominio.Professor;

@RestController
@RequestMapping(value = "/professor")
public class ProfessorController {
    
@GetMapping
public Professor getObjects() {
    Professor d1 = new Professor();
    d1.setCodigo(1);
    d1.setNome("Nome");

    return d1;
}

}
