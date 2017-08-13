package br.com.locadoraDeVeiculos.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by thiago on 13/08/2017.
 */
class TipoCoberturaSeguroTest {

    TipoCoberturaSeguro tipoCoberturaSeguro;

    @BeforeEach
    void setUp() {
        tipoCoberturaSeguro = new TipoCoberturaSeguro("total", true);
    }

    @Test
    void getNome() {
        assertEquals("total", tipoCoberturaSeguro.getNome());
    }

    @Test
    void getParticipacaoObrigatoria() {
        assertEquals(true, tipoCoberturaSeguro.getParticipacaoObrigatoria());
    }

}