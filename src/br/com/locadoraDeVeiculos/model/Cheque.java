package br.com.locadoraDeVeiculos.model;

public class Cheque extends Pagamento {

    private String banco;
    private String agencia;
    private String conta;
    private Integer nrCheque;

    public Cheque() {
    }

    public Cheque(String banco, String agencia, String conta, Integer nrCheque) {
        this.banco = banco;
        this.agencia = agencia;
        this.conta = conta;
        this.nrCheque = nrCheque;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public Integer getNrCheque() {
        return nrCheque;
    }

    public void setNrCheque(Integer nrCheque) {
        this.nrCheque = nrCheque;
    }

}
