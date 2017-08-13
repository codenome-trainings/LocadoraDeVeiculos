package br.com.locadoraDeVeiculos.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by thiago on 13/08/2017.
 */
class ModeloTest {

    Modelo modelo;

    @BeforeEach
    void setUp() {
        modelo = new Modelo("uno", "fiat", new Integer(4));
    }

    @Test
    void getNome() {
        assertEquals("uno", modelo.getNome());
    }

    @Test
    void getMarca() {
        assertEquals("fiat", modelo.getMarca());
    }

    @Test
    void getCapacidade() {
        assertEquals(new Integer(4), modelo.getCapacidade());
    }

}