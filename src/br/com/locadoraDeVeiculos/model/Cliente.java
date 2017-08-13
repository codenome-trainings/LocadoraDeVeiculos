package br.com.locadoraDeVeiculos.model;

import java.util.List;

public class Cliente {
    private String endereco;
    private String email;
    private List<String> telefones;

    public Cliente() {
    }

    public Cliente(String endereco, String email, List<String> telefones) {
        this.endereco = endereco;
        this.email = email;
        this.telefones = telefones;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<String> getTelefones() {
        return telefones;
    }

    public void setTelefones(List<String> telefones) {
        this.telefones = telefones;
    }


}
