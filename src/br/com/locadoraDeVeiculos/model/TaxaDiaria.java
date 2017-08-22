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

    public Double getValor() {
        return valor;
    }

    public Grupo getGrupo() {
        return grupo;
    }
}
