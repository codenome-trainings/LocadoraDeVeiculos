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

    public String getNome() {
        return nome;
    }

}
