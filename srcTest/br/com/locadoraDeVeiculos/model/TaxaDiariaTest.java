package br.com.locadoraDeVeiculos.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by thiago on 13/08/2017.
 */
class TaxaDiariaTest {

    TaxaDiaria taxaDiaria;

    @BeforeEach
    void setUp() {
        taxaDiaria = new TaxaDiaria(
                new Double(300),
                new Grupo(new Double(300), "thGrupo"),
                new TipoCoberturaSeguro("total", true)
        );
    }

    @Test
    void getTipoCoberturaSeguro() {
        assertEquals("total", taxaDiaria.getTipoCoberturaSeguro().getNome());
        assertEquals(true, taxaDiaria.getTipoCoberturaSeguro().getParticipacaoObrigatoria());
    }

    @Test
    void getValor() {
        assertEquals(new Double(300), taxaDiaria.getValor());
    }

    @Test
    void getGrupo() {
        assertEquals(new Double(300), taxaDiaria.getGrupo().getPreco());
        assertEquals("thGrupo", taxaDiaria.getGrupo().getNome());
    }

}