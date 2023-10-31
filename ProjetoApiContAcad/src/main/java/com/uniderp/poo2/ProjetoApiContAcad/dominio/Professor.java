package com.uniderp.poo2.ProjetoApiContAcad.dominio;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_professor")
public class Professor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;
    private String nome;
    private String cargo;
    private LocalDate data_de_nascimento;
    private String usuario;
    private String senha;
    
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

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public LocalDate getData_de_nascimento() {
        return data_de_nascimento;
    }

    public void setData_de_nascimento(LocalDate data_de_nascimento) {
        this.data_de_nascimento = data_de_nascimento;
    }

    public String getNome_de_usuario() {
        return usuario;
    }

    public void setNome_de_usuario(String nome_de_usuario) {
        this.usuario = nome_de_usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Professor() {

    }

    public Professor(Long codigo, String nome, String cargo, LocalDate data_de_nascimento, String nome_de_usuario,
            String senha) {
        this.codigo = codigo;
        this.nome = nome;
        this.cargo = cargo;
        this.data_de_nascimento = data_de_nascimento;
        this.usuario = nome_de_usuario;
        this.senha = senha;
    }

}
