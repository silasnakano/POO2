package uniderp.br.com.dominio;

import java.time.LocalDate;

public class Aluno extends BasePessoaFisica{
    
    private String matricula;
    private LocalDate dataMatricula;
    
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public LocalDate getDataMatricula() {
        return dataMatricula;
    }
    public void setDataMatricula(LocalDate dataMatricula) {
        this.dataMatricula = dataMatricula;
    }

    public Aluno(String nome, String rg, String cpf, LocalDate dataNascimento, String matricula,
            LocalDate dataMatricula) {
        super(nome, rg, cpf, dataNascimento);
        this.matricula = matricula;
        this.dataMatricula = dataMatricula;
    }

    @Override
    public String toString() {
        return "Aluno [matricula=" + matricula + ", dataMatricula=" + dataMatricula + "]";
    }    

}
