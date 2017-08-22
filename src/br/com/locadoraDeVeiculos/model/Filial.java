package br.com.locadoraDeVeiculos.model;

public class Filial {

    private String nome;
    private String endereco;
    private String telefone;

    public Filial() {
    }

    public Filial(String nome, String endereco, String telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getTelefone() {
        return telefone;
    }

}
