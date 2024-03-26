package classes;

public class ServicoPedidoUrgente implements IServico {

    public String enviar() {
        return "Pedido Urgente Enviado";
    }

    public String cancelar() {
        return "Pedido Urgente Cancelado";
    }
    
}
