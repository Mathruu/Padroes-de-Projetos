package test;

import org.junit.jupiter.api.Test;


import classes.Parametros;

import static org.junit.jupiter.api.Assertions.*;

public class ParametrosTest {

    
    @Test
    public void deveRetornarNomeFuncionario() {
        Parametros.getInstance().setNome("Matheus");
        assertEquals("Matheus", Parametros.getInstance().getNome());
    }

    @Test
    public void deveRetornarFuncaoFuncionario() {
        Parametros.getInstance().setFuncao("Gerente");
        assertEquals("Gerente", Parametros.getInstance().getFuncao());
    }
}
