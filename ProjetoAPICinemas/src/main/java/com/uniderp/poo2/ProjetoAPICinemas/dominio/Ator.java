package com.uniderp.poo2.ProjetoAPICinemas.dominio;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_ator")
public class Ator {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;
    
    private String nome;
    private String papelDoAtor;

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPapelDoAtor() {
        return papelDoAtor;
    }

    public void setPapelDoAtor(String papelDoAtor) {
        this.papelDoAtor = papelDoAtor;
    }

    public Ator() {

    }

    public Ator(Long codigo, String nome, String papelDoAtor) {
        this.codigo = codigo;
        this.nome = nome;
        this.papelDoAtor = papelDoAtor;
    }
    
}
