package br.com.locadoraDeVeiculos.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by thiago on 13/08/2017.
 */
class ClienteTest {

    Cliente cliente;

    @BeforeEach
    void setUp() {
        List<String> telefones = new ArrayList<>();
        telefones.add("1234");
        telefones.add("4321");
        cliente = new Cliente("Rua das Pacas", "grupocodenome@gmail.com", telefones);
    }

    @Test
    void getEndereco() {
        assertEquals("Rua das Pacas", cliente.getEndereco());
    }

    @Test
    void getEmail() {
        assertEquals("grupocodenome@gmail.com", cliente.getEmail());
    }

    @Test
    void getTelefones() {
        List<String> telefones = new ArrayList<>();
        telefones.add("1234");
        telefones.add("4331");
        assertEquals(telefones, cliente.getTelefones());

    }

}