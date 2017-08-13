package br.com.locadoraDeVeiculos.model;

public class PessoaFisica extends Cliente {

    private String nome;
    private String cpf;
    private String indentidade;

    public PessoaFisica() {
    }

    public PessoaFisica(String nome, String cpf, String indentidade) {
        this.nome = nome;
        this.cpf = cpf;
        this.indentidade = indentidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getIndentidade() {
        return indentidade;
    }

    public void setIndentidade(String indentidade) {
        this.indentidade = indentidade;
    }

}
