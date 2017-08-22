package br.com.locadoraDeVeiculos.model;

public class Modelo {

    private String nome;
    private String marca;
    private Integer capacidade;

    public Modelo() {
    }

    public Modelo(String nome, String marca, Integer capacidade) {
        this.nome = nome;
        this.marca = marca;
        this.capacidade = capacidade;
    }

    public String getNome() {
        return nome;
    }

    public String getMarca() {
        return marca;
    }

    public Integer getCapacidade() {
        return capacidade;
    }

}
