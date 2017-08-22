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

    public String getCnpj() {
        return cnpj;
    }

    public String getContato() {
        return contato;
    }

}
