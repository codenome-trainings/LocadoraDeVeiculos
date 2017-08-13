package br.com.locadoraDeVeiculos.model;

import java.util.Calendar;

public class Reserva {

    private Calendar dataHoraRetirada;
    private Calendar dataHoraDevolucao;
    private Filial devolucao;
    private Filial retirada;
    private TipoCoberturaSeguro tipoCoberturaSeguro;
    private TipoDiaria tipoDiaria;
    private Grupo grupo;
    private Cliente cliente;

    public Reserva(Calendar dataHoraRetirada, Calendar dataHoraDevolucao, Filial devolucao, Filial retirada,
                   TipoCoberturaSeguro tipoCoberturaSeguro, TipoDiaria tipoDiaria, Grupo grupo, Cliente cliente) {
        this.dataHoraRetirada = dataHoraRetirada;
        this.dataHoraDevolucao = dataHoraDevolucao;
        this.devolucao = devolucao;
        this.retirada = retirada;
        this.tipoCoberturaSeguro = tipoCoberturaSeguro;
        this.tipoDiaria = tipoDiaria;
        this.grupo = grupo;
        this.cliente = cliente;
    }

    public Reserva() {
    }

    public Calendar getDataHoraRetirada() {
        return dataHoraRetirada;
    }

    public void setDataHoraRetirada(Calendar dataHoraRetirada) {
        this.dataHoraRetirada = dataHoraRetirada;
    }

    public Calendar getDataHoraDevolucao() {
        return dataHoraDevolucao;
    }

    public void setDataHoraDevolucao(Calendar dataHoraDevolucao) {
        this.dataHoraDevolucao = dataHoraDevolucao;
    }

    public Filial getDevolucao() {
        return devolucao;
    }

    public void setDevolucao(Filial devolucao) {
        this.devolucao = devolucao;
    }

    public Filial getRetirada() {
        return retirada;
    }

    public void setRetirada(Filial retirada) {
        this.retirada = retirada;
    }

    public TipoCoberturaSeguro getTipoCoberturaSeguro() {
        return tipoCoberturaSeguro;
    }

    public void setTipoCoberturaSeguro(TipoCoberturaSeguro tipoCoberturaSeguro) {
        this.tipoCoberturaSeguro = tipoCoberturaSeguro;
    }

    public TipoDiaria getTipoDiaria() {
        return tipoDiaria;
    }

    public void setTipoDiaria(TipoDiaria tipoDiaria) {
        this.tipoDiaria = tipoDiaria;
    }

    public Grupo getGrupo() {
        return grupo;
    }

    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

}
