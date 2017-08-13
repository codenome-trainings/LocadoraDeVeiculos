package br.com.locadoraDeVeiculos.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by thiago on 13/08/2017.
 */
class PessoaFisicaTest {

    PessoaFisica pessoaFisica;

    @BeforeEach
    void setUp() {
        pessoaFisica = new PessoaFisica("Thiago Cunha", "12312312333", "121231233");
    }

    @Test
    void getNome() {
        assertEquals("Thiago Cunha", pessoaFisica.getNome());
    }

    @Test
    void getCpf() {
        assertEquals("12312312333", pessoaFisica.getCpf());
    }

    @Test
    void getIndentidade() {
        assertEquals("121231233", pessoaFisica.getIndentidade());
    }

}