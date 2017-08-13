package br.com.locadoraDeVeiculos.model;

public class TaxaDiaria {

    private Double valor;
    private Grupo grupo;
    private TipoCoberturaSeguro tipoCoberturaSeguro;

    public TaxaDiaria() {
    }

    public TaxaDiaria(Double valor, Grupo grupo, TipoCoberturaSeguro tipoCoberturaSeguro) {
        this.valor = valor;
        this.grupo = grupo;
        this.tipoCoberturaSeguro = tipoCoberturaSeguro;
    }

    public TipoCoberturaSeguro getTipoCoberturaSeguro() {
        return tipoCoberturaSeguro;
    }

    public void setTipoCoberturaSeguro(TipoCoberturaSeguro tipoCoberturaSeguro) {
        this.tipoCoberturaSeguro = tipoCoberturaSeguro;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Grupo getGrupo() {
        return grupo;
    }

    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }

}
