package br.com.locadoraDeVeiculos.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by thiago on 13/08/2017.
 */
class FilialTest {

    Filial filial;

    @BeforeEach
    void setUp() {
        filial = new Filial("Jacaranda", "Rua das Pacas", "997891865");
    }

    @Test
    void getNome() {
        assertEquals("Jacaranda", filial.getNome());
    }

    @Test
    void getEndereco() {
        assertEquals("Rua das Pacas", filial.getEndereco());
    }

    @Test
    void getTelefone() {
        assertEquals("997891865", filial.getTelefone());
    }

}