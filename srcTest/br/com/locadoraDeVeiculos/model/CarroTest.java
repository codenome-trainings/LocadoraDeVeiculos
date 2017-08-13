package br.com.locadoraDeVeiculos.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by thiago on 13/08/2017.
 */
class CarroTest {

    Carro carro;
    @BeforeEach
    void setUp() {
        Modelo modelo = new Modelo("Uno", "Fiat", 4);
        Grupo grupo = new Grupo(new Double(300), "Grupo");
        Filial filial = new Filial("Filial", "Rua das Pacas", "997891865");
        carro = new Carro(
                "asd1234",
                "chassi",
                "renavam",
                1989,
                1.2,
                "vermelho",
                4,
                true,
                true,
                true,
                true,
                true,
                modelo,
                grupo,
                filial
                );
    }

    @Test
    void getPlaca() {
        assertEquals("asd1234", carro.getPlaca());
    }

    @Test
    void getChassi() {
        assertEquals("chassi", carro.getChassi());
    }

    @Test
    void getRenavam() {
        assertEquals("renavam", carro.getRenavam());
    }

    @Test
    void getAnoDeFabricacao() {
        assertEquals(new Integer(1989), carro.getAnoDeFabricacao());
    }

    @Test
    void getPotencialMotor() {
        assertEquals(new Double(1.2), carro.getPotencialMotor(), 0.0001);
    }

    @Test
    void getCor() {
        assertEquals("vermelho", carro.getCor());
    }

    @Test
    void getNumeroDePortas() {
        assertEquals(new Integer(4), carro.getNumeroDePortas());
    }

    @Test
    void getArCondicionado() {
        assertEquals(true, carro.getArCondicionado());
    }

    @Test
    void getDirecaoHidraulica() {
        assertEquals(true, carro.getDirecaoHidraulica());
    }

    @Test
    void getFreioAbs() {
        assertEquals(true, carro.getFreioAbs());
    }

    @Test
    void getAirBag() {
        assertEquals(true, carro.getAirBag());
    }

    @Test
    void getRadio() {
        assertEquals(true, carro.getRadio());
    }

    @Test
    void getModelo() {

    }

    @Test
    void getGrupo() {
    }

    @Test
    void getFilial() {
    }


}