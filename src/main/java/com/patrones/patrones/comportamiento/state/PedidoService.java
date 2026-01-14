package com.patrones.patrones.comportamiento.state;

import org.springframework.stereotype.Service;

@Service
public class PedidoService {

    private final Pedido pedido;

    public PedidoService(Pedido pedido) {
        this.pedido = pedido;
    }

    public void pagarPedido() {
        pedido.pagar();
    }

    public void enviarPedido() {
        pedido.enviar();
    }

    public void entregarPedido() {
        pedido.entregar();
    }

    public void cancelarPedido() {
        pedido.cancelar();
    }

    public String estadoActual() {
        return pedido.getEstadoActual();
    }
}

