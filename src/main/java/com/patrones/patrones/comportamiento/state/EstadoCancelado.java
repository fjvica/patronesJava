package com.patrones.patrones.comportamiento.state;

public class EstadoCancelado implements EstadoPedido {

    @Override
    public void pagar(Pedido pedido) {
        throw new IllegalStateException("❌ No se puede pagar un pedido cancelado.");
    }

    @Override
    public void enviar(Pedido pedido) {
        throw new IllegalStateException("❌ No se puede enviar un pedido cancelado.");
    }

    @Override
    public void entregar(Pedido pedido) {
        throw new IllegalStateException("❌ No se puede entregar un pedido cancelado.");
    }

    @Override
    public void cancelar(Pedido pedido) {
        throw new IllegalStateException("❌ El pedido ya está cancelado.");
    }

    @Override
    public String nombre() {
        return "CANCELADO";
    }
}

