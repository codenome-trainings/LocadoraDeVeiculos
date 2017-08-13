package br.com.locadoraDeVeiculos.model;

import java.util.Calendar;

public class Locacao {

    private Double valor;
    private Long kmVeiculo;
    private Long kmVeiculoDevolvido;
    private Calendar dataHoraDevolucao;
    private Calendar dataHoraRetirada;
    private Carro carro;
    private Motorista motorista;
    private Reserva reserva;
    private Pagamento pagamento;

    public Locacao() {
    }

    public Locacao(Double valor, Long kmVeiculo, Long kmVeiculoDevolvido, Calendar dataHoraDevolucao,
                   Calendar dataHoraRetirada, Carro carro, Motorista motorista, Reserva reserva, Pagamento pagamento) {

        this.valor = valor;
        this.kmVeiculo = kmVeiculo;
        this.kmVeiculoDevolvido = kmVeiculoDevolvido;
        this.dataHoraDevolucao = dataHoraDevolucao;
        this.dataHoraRetirada = dataHoraRetirada;
        this.carro = carro;
        this.motorista = motorista;
        this.reserva = reserva;
        this.pagamento = pagamento;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Long getKmVeiculo() {
        return kmVeiculo;
    }

    public void setKmVeiculo(Long kmVeiculo) {
        this.kmVeiculo = kmVeiculo;
    }

    public Long getKmVeiculoDevolvido() {
        return kmVeiculoDevolvido;
    }

    public void setKmVeiculoDevolvido(Long kmVeiculoDevolvido) {
        this.kmVeiculoDevolvido = kmVeiculoDevolvido;
    }

    public Calendar getDataHoraDevolucao() {
        return dataHoraDevolucao;
    }

    public void setDataHoraDevolucao(Calendar dataHoraDevolucao) {
        this.dataHoraDevolucao = dataHoraDevolucao;
    }

    public Calendar getDataHoraRetirada() {
        return dataHoraRetirada;
    }

    public void setDataHoraRetirada(Calendar dataHoraRetirada) {
        this.dataHoraRetirada = dataHoraRetirada;
    }

    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    public Motorista getMotorista() {
        return motorista;
    }

    public void setMotorista(Motorista motorista) {
        this.motorista = motorista;
    }

    public Reserva getReserva() {
        return reserva;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }

    public Pagamento getPagamento() {
        return pagamento;
    }

    public void setPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }

}
