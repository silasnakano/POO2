package uniderp.br.com.dominio;

import java.time.LocalDate;

public abstract class BaseDadosComuns {
    
    protected LocalDate dataInsercao;

    public LocalDate getDataInsercao() {
        return dataInsercao;
    }

    public void setDataInsercao(LocalDate dataInsercao) {
        this.dataInsercao = dataInsercao;
    }

    public BaseDadosComuns(LocalDate dataInsercao) {
        this.dataInsercao = dataInsercao;
    }

}
