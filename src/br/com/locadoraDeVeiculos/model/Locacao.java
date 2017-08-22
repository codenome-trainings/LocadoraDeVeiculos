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

    public Locacao() {
    }

    public Locacao(Double valor, Long kmVeiculo, Long kmVeiculoDevolvido, Calendar dataHoraDevolucao, Calendar dataHoraRetirada, Carro carro, List<Motorista> motoristas, Reserva reserva, Pagamento pagamento) {
        this.valor = valor;
        this.kmVeiculo = kmVeiculo;
        this.kmVeiculoDevolvido = kmVeiculoDevolvido;
        this.dataHoraDevolucao = dataHoraDevolucao;
        this.dataHoraRetirada = dataHoraRetirada;
        this.carro = carro;
        this.motoristas = motoristas;
        this.reserva = reserva;
        this.pagamento = pagamento;
    }

    public Double getValor() {
        return valor;
    }

    public Long getKmVeiculo() {
        return kmVeiculo;
    }

    public Long getKmVeiculoDevolvido() {
        return kmVeiculoDevolvido;
    }

    public Calendar getDataHoraDevolucao() {
        return dataHoraDevolucao;
    }

    public Calendar getDataHoraRetirada() {
        return dataHoraRetirada;
    }

    public Carro getCarro() {
        return carro;
    }

    public List<Motorista> getMotoristas() {
        return motoristas;
    }

    public Reserva getReserva() {
        return reserva;
    }

    public Pagamento getPagamento() {
        return pagamento;
    }
}
