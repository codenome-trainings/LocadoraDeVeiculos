package br.com.locadoraDeVeiculos.model;

public class Motorista {

    private String cnh;

    public Motorista(String cnh) {
        this.cnh = cnh;
    }

    public Motorista() {

    }

    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }

}
