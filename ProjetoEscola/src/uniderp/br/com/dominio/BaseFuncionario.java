package uniderp.br.com.dominio;

import java.time.LocalDate;

public abstract class BaseFuncionario {
    
    protected String cracha;
    protected String registro;
    protected LocalDate dataVinculoInicial;
    protected LocalDate dataVinculoFinal;
    
    public String getCracha() {
        return cracha;
    }
    public void setCracha(String cracha) {
        this.cracha = cracha;
    }
    public String getRegistro() {
        return registro;
    }
    public void setRegistro(String registro) {
        this.registro = registro;
    }
    public LocalDate getDataVinculoInicial() {
        return dataVinculoInicial;
    }
    public void setDataVinculoInicial(LocalDate dataVinculoInicial) {
        this.dataVinculoInicial = dataVinculoInicial;
    }
    public LocalDate getDataVinculoFinal() {
        return dataVinculoFinal;
    }
    public void setDataVinculoFinal(LocalDate dataVinculoFinal) {
        this.dataVinculoFinal = dataVinculoFinal;
    }

    public BaseFuncionario(String cracha, String registro, LocalDate dataVinculoInicial, LocalDate dataVinculoFinal) {
        this.cracha = cracha;
        this.registro = registro;
        this.dataVinculoInicial = dataVinculoInicial;
        this.dataVinculoFinal = dataVinculoFinal;
    }

}
