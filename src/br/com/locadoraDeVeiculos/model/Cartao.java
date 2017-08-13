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

    public void setOperadora(String operadora) {
        this.operadora = operadora;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Calendar getDataAutorizacao() {
        return dataAutorizacao;
    }

    public void setDataAutorizacao(Calendar dataAutorizacao) {
        this.dataAutorizacao = dataAutorizacao;
    }

}
