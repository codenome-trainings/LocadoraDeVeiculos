package br.com.locadoraDeVeiculos.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by thiago on 13/08/2017.
 */
class PessoaJuridicaTest {
    PessoaJuridica pj;

    @BeforeEach
    void setUp() {
        pj = new PessoaJuridica("123123123", "123123123", "123123123");
    }

    @Test
    void getRazaoSocial() {
        assertEquals("123123123", pj.getRazaoSocial());
    }

    @Test
    void getCnpj() {
        assertEquals("123123123", pj.getCnpj());
    }

    @Test
    void getContato() {
        assertEquals("123123123", pj.getContato());
    }

}