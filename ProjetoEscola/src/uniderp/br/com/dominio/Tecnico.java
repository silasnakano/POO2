package uniderp.br.com.dominio;

import java.time.LocalDate;

public class Tecnico extends BaseFuncionario{

    private String setor;

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public Tecnico(String cracha, String registro, LocalDate dataVinculoInicial, LocalDate dataVinculoFinal,
            String setor) {
        super(cracha, registro, dataVinculoInicial, dataVinculoFinal);
        this.setor = setor;
    }

}
