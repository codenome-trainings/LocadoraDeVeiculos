package br.com.locadoraDeVeiculos.model;

public class PessoaJuridica extends Cliente {

    private String razaoSocial;
    private String cnpj;
    private String contato;

    public PessoaJuridica() {
    }

    public PessoaJuridica(String razaoSocial, String cnpj, String contato) {
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
        this.contato = contato;
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

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

}
