package test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import classes.MegaSena;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MegaSenaTest {

    MegaSena megaSena;

    @BeforeEach
    void setUp() {
        megaSena = new MegaSena();
    }

    @Test
    public void testSortearNumerosBilheteInvalidoForaDoIntervalo() {
        List<Integer> bilheteInvalido = Arrays.asList(1, 2, 3, 4, 5, 70);
        assertEquals(0.0, megaSena.sortearNumeros(bilheteInvalido, 2.0));
    }

    @Test
    public void testSortearNumerosBilheteInvalidoDuplicado() {
        List<Integer> bilheteInvalidoDuplicado = Arrays.asList(1, 2, 3, 4, 5, 5);
        assertEquals(0.0, megaSena.sortearNumeros(bilheteInvalidoDuplicado, 2.0));
    }

    @Test
    public void testSortearNumerosBilheteSemAcertos() {
        List<Integer> bilheteSemAcertos = Arrays.asList(1, 2, 3, 4, 5, 6);
        assertEquals(0.0, megaSena.sortearNumeros(bilheteSemAcertos, 2.0));
    }

    @Test
    public void testSortearNumerosBilheteComQuatroAcertos() {
        List<Integer> bilheteQuatroAcertos = Arrays.asList(1, 2, 3, 4, 10, 20);
        assertEquals(0.05, megaSena.sortearNumeros(bilheteQuatroAcertos, 2.0));
    }
    
    @Test
    public void testSortearNumerosBilheteComCincoAcertos() {
        List<Integer> bilheteCincoAcertos = Arrays.asList(1, 2, 3, 4, 5, 20);
        assertEquals(0.4, megaSena.sortearNumeros(bilheteCincoAcertos, 2.0));
    }
    
    @Test
    public void testSortearNumerosBilheteComSeisAcertos() {
        List<Integer> bilheteSeisAcertos = Arrays.asList(1, 2, 3, 4, 5, 6);
        assertEquals(2.0, megaSena.sortearNumeros(bilheteSeisAcertos, 2.0));
    }
}
