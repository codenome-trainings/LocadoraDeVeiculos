package br.com.locadoraDeVeiculos.model;

import java.util.Calendar;

public class Cartao extends Pagamento {

    private String operadora;
    private String numero;
    private Calendar dataAutorizacao;

    public Cartao() {
    }

    public Cartao(String operadora, String numero, Calendar dataAutorizacao) {
        this.operadora = operadora;
        this.numero = numero;
        this.dataAutorizacao = dataAutorizacao;
    }

    public String getOperadora() {
        return operadora;
    }

    public String getNumero() {
        return numero;
    }

    public Calendar getDataAutorizacao() {
        return dataAutorizacao;
    }

}
