package com.uniderp.poo2.ProjetoAPICinemas.dominio;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_filme")
public class Filme {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;

    private String titulo;
    private int duracao;
    private String genero;

    @OneToOne
    @JoinColumn(name = "filme_ator_id")
    private FilmeAtor filmeAtor;

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public String getGenero() {
        return genero;
    }
    
    public void setGenero(String genero) {
        this.genero = genero;
    }

    public FilmeAtor getFilmeAtor() {
        return filmeAtor;
    }

    public void setFilmeAtor(FilmeAtor filmeAtor) {
        this.filmeAtor = filmeAtor;
    }

    public Filme() {

    }

    public Filme(Long codigo, String titulo, int duracao, String genero, FilmeAtor filmeAtor) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.duracao = duracao;
        this.genero = genero;
        this.filmeAtor = filmeAtor;
    }

}
