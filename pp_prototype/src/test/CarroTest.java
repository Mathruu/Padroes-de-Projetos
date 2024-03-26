package test;

import org.junit.jupiter.api.Test;

import classes.Carro;
import classes.Marca;

import static org.junit.jupiter.api.Assertions.*;

class CarroTest {

    @Test
    void testClone() throws CloneNotSupportedException {

        Carro carro = new Carro("Corolla", new Marca("Toyota", 2020), "Prata");

        Carro carroClone = carro.clone();
        carroClone.setModelo("Hilux");
        carroClone.setCor("Azul");
        carroClone.getMarca().setAnoFundacao(2021);

        assertEquals("Carro{marca=Marca{nome='Toyota', anoFundacao=2020}, modelo='Corolla', cor='Prata'}", carro.toString());
        assertEquals("Carro{marca=Marca{nome='Toyota', anoFundacao=2021}, modelo='Hilux', cor='Azul'}", carroClone.toString());

    }
}
