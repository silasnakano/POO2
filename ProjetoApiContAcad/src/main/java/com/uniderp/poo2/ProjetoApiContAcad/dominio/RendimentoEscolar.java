package com.uniderp.poo2.ProjetoApiContAcad.dominio;

import java.util.ArrayList;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_rendimento_escolar")
public class RendimentoEscolar {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;

    @OneToOne
    @JoinColumn(name = "aluno_id")
    private Aluno aluno;

    @ManyToOne
    @JoinColumn(name = "turma_id")
    private Turma turma;
    
    private double p1;
    private double p2;

    ArrayList<String> trabalhos = new ArrayList<>();

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }
    
    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    public double getP1() {
        return p1;
    }

    public void setP1(double p1) {
        this.p1 = p1;
    }

    public double getP2() {
        return p2;
    }

    public void setP2(double p2) {
        this.p2 = p2;
    }

    public ArrayList<String> getTrabalhos() {
        return trabalhos;
    }

    public void setTrabalhos(ArrayList<String> trabalhos) {
        this.trabalhos = trabalhos;
    }

    public RendimentoEscolar() {

    }

    public RendimentoEscolar(Long codigo, Aluno aluno, Turma turma, double p1, double p2, ArrayList<String> trabalhos) {
        this.codigo = codigo;
        this.aluno = aluno;
        this.turma = turma;
        this.p1 = p1;
        this.p2 = p2;
        this.trabalhos = trabalhos;
    }

}
