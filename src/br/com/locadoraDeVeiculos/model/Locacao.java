package br.com.locadoraDeVeiculos.model;

import java.util.Calendar;
import java.util.List;

public class Locacao {

    private Double valor;
    private Long kmVeiculo;
    private Long kmVeiculoDevolvido;
    private Calendar dataHoraDevolucao;
    private Calendar dataHoraRetirada;
    private Carro carro;
    private List<Motorista> motoristas;
    private Reserva reserva;
    private Pagamento pagamento;


}
