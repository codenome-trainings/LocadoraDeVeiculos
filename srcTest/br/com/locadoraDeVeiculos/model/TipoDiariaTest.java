package br.com.locadoraDeVeiculos.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by thiago on 13/08/2017.
 */
class TipoDiariaTest {
    @BeforeEach
    void setUp() {
    }

    @Test
    void getKmLivre() {
        assertEquals(TipoDiaria.KmLivre, TipoDiaria.KmLivre);
    }

    @Test
    void getSemKmLivre() {
        assertEquals(TipoDiaria.SemKmLivre, TipoDiaria.SemKmLivre);
    }

}