package br.com.locadoraDeVeiculos.model;

public class Dinheiro extends Pagamento {

    public Dinheiro() {
    }

    public Dinheiro(Double valor) {
        super(valor);
    }

    @Override
    public Double getValor() {
        return super.getValor();
    }

    @Override
    public void setValor(Double valor) {
        super.setValor(valor);
    }
}
