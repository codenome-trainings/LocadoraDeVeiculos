package br.com.locadoraDeVeiculos.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by thiago on 13/08/2017.
 */
class MotoristaTest {

    Motorista motorista;

    @BeforeEach
    void setUp() {
        motorista = new Motorista("1234");
    }

    @Test
    void getCnh() {
        assertEquals("1234", motorista.getCnh());
    }

}