package br.com.locadoraDeVeiculos.model;

public class TipoCoberturaSeguro {

    private String nome;
    private Boolean participacaoObrigatoria;

    public TipoCoberturaSeguro() {
    }

    public TipoCoberturaSeguro(String nome, Boolean participacaoObrigatoria) {

        this.nome = nome;
        this.participacaoObrigatoria = participacaoObrigatoria;
    }

    public String getNome() {
        return nome;
    }

    public Boolean getParticipacaoObrigatoria() {
        return participacaoObrigatoria;
    }

}
