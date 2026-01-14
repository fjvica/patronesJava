package com.patrones.patrones.comportamiento.observer;

public class PedidoCreadoEvent {
    private final Pedido pedido;

    public PedidoCreadoEvent(Pedido pedido) {
        this.pedido = pedido;
    }

    public Pedido getPedido() {
        return pedido;
    }
}

