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
class ReservaTest {

    Reserva reserva;

    @BeforeEach
    void setUp() {
        List<String> telefones = new ArrayList<>();
        telefones.add("1234");
        telefones.add("4321");
        reserva = new Reserva(
                Calendar.getInstance(),
                Calendar.getInstance(),
                new Filial("Jacaranda", "Rua das Pacas", "123123123"),
                new Filial("Jacaranda", "Rua das Pacas", "123123123"),
                new TipoCoberturaSeguro("nome", true),
                TipoDiaria.SemKmLivre,
                new Grupo(new Double(300), "Carro"),
                new Cliente("Rua das Pacas", "grupocodenome@gmail.com", telefones)
        );
    }

    @Test
    void getDataHoraRetirada() {
        assertEquals(Calendar.getInstance(), reserva.getDataHoraRetirada());
    }

    @Test
    void getDataHoraDevolucao() {
        assertEquals(Calendar.getInstance(), reserva.getDataHoraDevolucao());
    }

    @Test
    void getDevolucao() {
        assertEquals("Jacaranda", reserva.getDevolucao().getNome());
        assertEquals("Rua das Pacas", reserva.getDevolucao().getEndereco());
        assertEquals("123123123", reserva.getDevolucao().getTelefone());
    }

    @Test
    void getRetirada() {
        assertEquals("Jacaranda", reserva.getRetirada().getNome());
        assertEquals("Rua das Pacas", reserva.getRetirada().getEndereco());
        assertEquals("123123123", reserva.getRetirada().getTelefone());
    }

    @Test
    void getTipoCoberturaSeguro() {
        assertEquals("nome", reserva.getTipoCoberturaSeguro().getNome());
        assertEquals(true, reserva.getTipoCoberturaSeguro().getParticipacaoObrigatoria());
    }

    @Test
    void getTipoDiaria() {
        assertEquals(TipoDiaria.SemKmLivre, reserva.getTipoDiaria());
    }

    @Test
    void getGrupo() {
        assertEquals(new Double(300), reserva.getGrupo().getPreco());
        assertEquals("Carro", reserva.getGrupo().getNome());
    }

    @Test
    void getCliente() {
        assertEquals("Rua das Pacas", reserva.getCliente().getEndereco());
        assertEquals("grupocodenome@gmail.com", reserva.getCliente().getEmail());

        List<String> telefones = new ArrayList<>();
        telefones.add("1234");
        telefones.add("4321");

        assertEquals("1234", reserva.getCliente().getTelefones().get(0));
        assertEquals("4321", reserva.getCliente().getTelefones().get(1));
    }

}