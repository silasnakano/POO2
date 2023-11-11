package com.uniderp.poo2.ProjetoAPICinemas.dominio;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_ingresso")
public class Ingresso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;

    private String tipo;
    private String categoria;

    @OneToOne
    @JoinColumn(name = "filme_id")
    private Filme filme;

    @OneToOne
    @JoinColumn(name = "sessao_id")
    private Sessao sessao;

    @OneToOne
    @JoinColumn(name = "sala_id")
    private Sala sala;
    
    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCategoria() {
        return categoria;
    }
    
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Filme getFilme() {
        return filme;
    }

    public void setFilme(Filme filme) {
        this.filme = filme;
    }

    public Sessao getSessao() {
        return sessao;
    }

    public void setSessao(Sessao sessao) {
        this.sessao = sessao;
    }

    public Ingresso() {

    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public Ingresso(Long codigo, String tipo, String categoria, Filme filme, Sessao sessao, Sala sala) {
        this.codigo = codigo;
        this.tipo = tipo;
        this.categoria = categoria;
        this.filme = filme;
        this.sessao = sessao;
        this.sala = sala;
    }

}
