package test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import classes.IServico;
import classes.ServicoFactory;

class ServicoFactoryTest {

    @Test
    void DeveRetornarExecaoParaServicoInexistente() {
        try {
            IServico servico = ServicoFactory.obterServico("Evasao");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Serviço inexistente", e.getMessage());
        }
    }

    @Test
    void DeveRetornarExecaoParaServicoInvalido() {
        try {
            IServico servico = ServicoFactory.obterServico("PedidoInternacional");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Serviço inválido", e.getMessage());
        }
    }
    
}
