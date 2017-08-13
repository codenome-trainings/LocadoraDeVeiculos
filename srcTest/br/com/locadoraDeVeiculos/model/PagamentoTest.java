package br.com.locadoraDeVeiculos.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by thiago on 13/08/2017.
 */
class PagamentoTest {

    Pagamento pagamento;

    @BeforeEach
    void setUp() {
        pagamento = new Pagamento(new Double(40));
    }

    @Test
    void getValor() {
        assertEquals(new Double(40), pagamento.getValor());
    }

}