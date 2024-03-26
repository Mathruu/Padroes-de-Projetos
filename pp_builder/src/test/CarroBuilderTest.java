package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import classes.Carro;
import classes.CarroBuilder;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;

class CarroBuilderTest {

    @Test
    void deveRetornarExcecaoParaCarroSemMarca() {
        try {
            CarroBuilder carroBuilder = new CarroBuilder();
            Carro carro = carroBuilder
                    .setModelo("Modelo 1")
                    .setAnoFabricacao(new Date())
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Marca inválida", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaCarroSemModelo() {
        try {
            CarroBuilder carroBuilder = new CarroBuilder();
            Carro carro = carroBuilder
                    .setMarca("Marca 1")
                    .setAnoFabricacao(new Date())
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Modelo inválido", e.getMessage());
        }
    }

    @Test
    void deveRetornarCarroValido() {
        CarroBuilder carroBuilder = new CarroBuilder();
        Carro carro = carroBuilder
                .setMarca("Marca 1")
                .setModelo("Modelo 1")
                .setAnoFabricacao(new Date())
                .build();

        assertNotNull(carro);
    }
}

