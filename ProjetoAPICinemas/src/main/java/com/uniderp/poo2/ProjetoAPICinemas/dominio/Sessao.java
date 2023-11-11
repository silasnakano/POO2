package com.uniderp.poo2.ProjetoAPICinemas.dominio;

import java.time.LocalDate;
import java.time.LocalTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_sessao")
public class Sessao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;

    private String statusDaSessao;
    private LocalDate data;
    private LocalTime horario;
    
    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getStatusDaSessao() {
        return statusDaSessao;
    }

    public void setStatusDaSessao(String statusDaSessao) {
        this.statusDaSessao = statusDaSessao;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public LocalTime getHorario() {
        return horario;
    }
    
    public void setHorario(LocalTime horario) {
        this.horario = horario;
    }

    public Sessao() {
    }

    public Sessao(Long codigo, String statusDaSessao, LocalDate data, LocalTime horario) {
        this.codigo = codigo;
        this.statusDaSessao = statusDaSessao;
        this.data = data;
        this.horario = horario;
    }
    
}
