package uniderp.br.com.dominio;

import java.time.LocalDate;

public class Professor extends BaseFuncionario{

    private String registro;
    private String cadeira;
    
    public String getRegistro() {
        return registro;
    }
    public void setRegistro(String registro) {
        this.registro = registro;
    }
    public String getCadeira() {
        return cadeira;
    }
    public void setCadeira(String cadeira) {
        this.cadeira = cadeira;
    }

    public Professor(String cracha, String registro, LocalDate dataVinculoInicial, LocalDate dataVinculoFinal,
            String registro2, String cadeira) {
        super(cracha, registro, dataVinculoInicial, dataVinculoFinal);
        registro = registro2;
        this.cadeira = cadeira;
    }
    
    @Override
    public String toString() {
        return "Professor [registro=" + registro + ", cadeira=" + cadeira + "]";
    }
    
}
