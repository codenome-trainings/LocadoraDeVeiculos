package br.com.locadoraDeVeiculos.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by thiago on 13/08/2017.
 */
class DinheiroTest {
    Dinheiro dinheiro;

    @BeforeEach
    void setUp() {
        dinheiro = new Dinheiro(new Double(321.99));
    }

    @Test
    void getValor() {
        assertEquals(new Double(321.99), dinheiro.getValor());
    }

}