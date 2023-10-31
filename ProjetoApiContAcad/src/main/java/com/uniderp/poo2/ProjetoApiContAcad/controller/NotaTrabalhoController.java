package com.uniderp.poo2.ProjetoApiContAcad.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.uniderp.poo2.ProjetoApiContAcad.dominio.NotaTrabalho;
import com.uniderp.poo2.ProjetoApiContAcad.repositories.NotaTrabalhoRepository;

@RestController
@RequestMapping(value = "/nota-trabalho")
public class NotaTrabalhoController {

    @Autowired
    private NotaTrabalhoRepository notaTrabalhoRepository;

    @GetMapping
    public List<NotaTrabalho> getObjects() {
        
        List<NotaTrabalho> list = notaTrabalhoRepository.findAll();

        return list;

    }
    
}
