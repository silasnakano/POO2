package uniderp.br.com.dominio;

import java.time.LocalDate;

public abstract class BasePessoaJuridica {
    
    protected String nomeFantasia;
    protected String razaoSocial;
    protected String cnpj;
    protected String ie;
    protected LocalDate dataAbertura;
    
    public String getNomeFantasia() {
        return nomeFantasia;
    }
    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }
    public String getRazaoSocial() {
        return razaoSocial;
    }
    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }
    public String getCnpj() {
        return cnpj;
    }
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    public String getIe() {
        return ie;
    }
    public void setIe(String ie) {
        this.ie = ie;
    }
    public LocalDate getDataAbertura() {
        return dataAbertura;
    }
    public void setDataAbertura(LocalDate dataAbertura) {
        this.dataAbertura = dataAbertura;
    }

    public BasePessoaJuridica(String nomeFantasia, String razaoSocial, String cnpj, String ie, LocalDate dataAbertura) {
        this.nomeFantasia = nomeFantasia;
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
        this.ie = ie;
        this.dataAbertura = dataAbertura;
    }

}
