package br.com.locadoraDeVeiculos.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by thiago on 13/08/2017.
 */
class ChequeTest {

    Cheque cheque;

    @BeforeEach
    void setUp() {
        cheque = new Cheque("itau", "6128", "1234", new Integer(1234));
    }

    @Test
    void getBanco() {
        assertEquals("itau", cheque.getBanco());
    }

    @Test
    void getAgencia() {
        assertEquals("6128", cheque.getAgencia());
    }

    @Test
    void getConta() {
        assertEquals("1234", cheque.getConta());
    }

    @Test
    void getNrCheque() {
        assertEquals(new Integer(1234), cheque.getNrCheque());
    }

}