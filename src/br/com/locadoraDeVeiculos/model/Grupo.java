package br.com.locadoraDeVeiculos.model;

public class Grupo {

    private Double preco;
    private String nome;

    public Grupo() {
    }

    public Grupo(Double preco, String nome) {
        this.preco = preco;
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
