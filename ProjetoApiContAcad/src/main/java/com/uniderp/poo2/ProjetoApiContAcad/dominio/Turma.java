package com.uniderp.poo2.ProjetoApiContAcad.dominio;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_turma")
public class Turma {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;

    @ManyToOne
    @JoinColumn(name = "disciplina_id")
    private Disciplina disciplina;

    @ManyToOne
    @JoinColumn(name = "professor_id")
    private Professor professor;

    @ManyToOne
    @JoinColumn(name = "aluno_id")
    private Aluno capacidade;
    
    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Aluno getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(Aluno capacidade) {
        this.capacidade = capacidade;
    }

    public Turma() {

    }

    public Turma(Long codigo, Disciplina disciplina, Professor professor, Aluno capacidade) {
        this.codigo = codigo;
        this.disciplina = disciplina;
        this.professor = professor;
        this.capacidade = capacidade;
    }
    
}
