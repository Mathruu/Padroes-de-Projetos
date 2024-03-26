package test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import classes.IServico;
import classes.ServicoFactory;

class ServicoPedidoTest {
    
    @Test
    void deveExecutarPedido() {
        IServico servico = ServicoFactory.obterServico("Pedido");
        assertEquals("Pedido Enviado", servico.enviar());
    }

    @Test
    void deveCancelarPedido() {
        IServico servico = ServicoFactory.obterServico("Pedido");
        assertEquals("Pedido Cancelado", servico.cancelar());
    }
}
