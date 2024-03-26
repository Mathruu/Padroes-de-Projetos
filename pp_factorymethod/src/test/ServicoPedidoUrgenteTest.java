package test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import classes.IServico;
import classes.ServicoFactory;

class ServicoPedidoUrgenteTest {
    

    @Test
    void deveExecutarPedidoUrgente() {
        IServico servico = ServicoFactory.obterServico("PedidoUrgente");
        assertEquals("Pedido Urgente Enviado", servico.enviar());
    }

    @Test
    void deveCancelarPedidoUrgente() {
        IServico servico = ServicoFactory.obterServico("PedidoUrgente");
        assertEquals("Pedido Urgente Cancelado", servico.cancelar());
    }
}
