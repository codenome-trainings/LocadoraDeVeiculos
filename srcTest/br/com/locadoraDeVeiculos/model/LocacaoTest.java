package br.com.locadoraDeVeiculos.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by thiago on 13/08/2017.
 */
class LocacaoTest {

    Locacao locacao;

    @BeforeEach
    void setUp() {
        List<String> telefones = new ArrayList<>();
        telefones.add("1234");
        telefones.add("4321");
        locacao = new Locacao(
                new Double(20),
                new Long(20),
                new Long(30),
                Calendar.getInstance(),
                Calendar.getInstance(),
                new Carro(
                        "asd1234",
                        "chassi",
                        "renavam",
                        1989,
                        1.2,
                        "vermelho",
                        4,
                        true,
                        true,
                        true,
                        true,
                        true,
                        new Modelo("Uno", "Fiat", 4),
                        new Grupo(new Double(300), "Grupo"),
                        new Filial("Filial", "Rua das Pacas", "997891865")
                ),
                new Motorista("1234"),
                new Reserva(
                        Calendar.getInstance(),
                        Calendar.getInstance(),
                        new Filial("Filial", "Rua das Pacas", "997891865"),
                        new Filial("Filial", "Rua das Oliveiras", "997891865"),
                        new TipoCoberturaSeguro("nome", true),
                        TipoDiaria.KmLivre,
                        new Grupo(new Double(300), "Grupo"),
                        new Cliente("Rua das Pacas", "grupocodenome@gmail.com", telefones)
                ),
                new Pagamento(new Double(200))
        );
    }

    @Test
    void getValor() {
        assertEquals(new Double(20), locacao.getValor());
    }

    @Test
    void getKmVeiculo() {
        assertEquals(new Long(20), locacao.getKmVeiculo());
    }

    @Test
    void getKmVeiculoDevolvido() {
        assertEquals(new Long(30), locacao.getKmVeiculoDevolvido());
    }

    @Test
    void getDataHoraDevolucao() {
        assertEquals(Calendar.getInstance(), locacao.getDataHoraDevolucao());
    }

    @Test
    void getDataHoraRetirada() {
        assertEquals(Calendar.getInstance(), locacao.getDataHoraRetirada());
    }

    @Test
    void getCarro() {
        Carro c = new Carro(
                "asd1234",
                "chassi",
                "renavam",
                1989,
                1.2,
                "vermelho",
                4,
                true,
                true,
                true,
                true,
                true,
                new Modelo("Uno", "Fiat", 4),
                new Grupo(new Double(300), "Grupo"),
                new Filial("Filial", "Rua das Pacas", "997891865")
        );
        assertEquals(c, locacao.getCarro());
    }

    @Test
    void getMotorista() {
        assertEquals(new Motorista("1234"), locacao.getMotorista().getCnh());
    }

    @Test
    void getReserva() {
        List<String> telefones = new ArrayList<String>();
        Reserva r = new Reserva(
                Calendar.getInstance(),
                Calendar.getInstance(),
                new Filial("Filial", "Rua das Pacas", "997891865"),
                new Filial("Filial", "Rua das Oliveiras", "997891865"),
                new TipoCoberturaSeguro("nome", true),
                TipoDiaria.KmLivre,
                new Grupo(new Double(300), "Grupo"),
                new Cliente("Rua das Pacas", "grupocodenome@gmail.com", telefones)
        );
        assertEquals(r, locacao.getReserva());
    }

    @Test
    void getPagamento() {
        Pagamento pagamento = new Pagamento(new Double(200));
        assertEquals(pagamento, locacao.getPagamento());
    }

}