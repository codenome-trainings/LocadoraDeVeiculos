package br.com.locadoraDeVeiculos.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by thiago on 13/08/2017.
 */
class GrupoTest {

    Grupo grupo;

    @BeforeEach
    void setUp() {
        grupo = new Grupo(new Double(300), "Carro");
    }

    @Test
    void getPreco() {
        assertEquals(new Double(300), grupo.getPreco());
    }

    @Test
    void getNome() {
        assertEquals(new String("Carro"), grupo.getNome());
    }

}