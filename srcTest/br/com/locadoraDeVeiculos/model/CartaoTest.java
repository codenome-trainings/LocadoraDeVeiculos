package br.com.locadoraDeVeiculos.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Calendar;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by thiago on 13/08/2017.
 */
class CartaoTest {

    Cartao cartao;
    @BeforeEach
    void setUp() {
        cartao = new Cartao("visa", "1234567890", Calendar.getInstance());
    }

    @Test
    void getOperadora() {
        assertEquals("visa", cartao.getOperadora());
    }

    @Test
    void getNumero() {
        assertEquals("1234567890", cartao.getNumero());
    }

    @Test
    void getDataAutorizacao() {
        assertEquals(Calendar.getInstance(), cartao.getDataAutorizacao());
    }

}