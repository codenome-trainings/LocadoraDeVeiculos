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

    public Calendar getDataHoraDevolucao() {
        return dataHoraDevolucao;
    }

    public Filial getDevolucao() {
        return devolucao;
    }

    public Filial getRetirada() {
        return retirada;
    }

    public TipoCoberturaSeguro getTipoCoberturaSeguro() {
        return tipoCoberturaSeguro;
    }

    public TipoDiaria getTipoDiaria() {
        return tipoDiaria;
    }

    public Grupo getGrupo() {
        return grupo;
    }

    public Cliente getCliente() {
        return cliente;
    }
}
