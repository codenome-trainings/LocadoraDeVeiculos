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

}
