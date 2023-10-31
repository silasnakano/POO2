package com.uniderp.poo2.ProjetoApiContAcad.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.uniderp.poo2.ProjetoApiContAcad.dominio.RendimentoEscolar;
import com.uniderp.poo2.ProjetoApiContAcad.repositories.RendimentoEscolarRepository;

@RestController
@RequestMapping(value = "/rendimento-escolar")
public class RendimentoEscolarController {

    @Autowired
    private RendimentoEscolarRepository rendimentoEscolarRepository;

    @GetMapping
    private List<RendimentoEscolar> getObjects() {

        List<RendimentoEscolar> list = rendimentoEscolarRepository.findAll();

        return list;

    }
    
}
