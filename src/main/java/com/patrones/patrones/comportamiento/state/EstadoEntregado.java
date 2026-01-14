package com.patrones.patrones.comportamiento.state;


public class EstadoEntregado implements EstadoPedido {

    @Override
    public void pagar(Pedido pedido) {
        throw new IllegalStateException("❌ El pedido ya está cerrado. No se puede pagar de nuevo.");
    }

    @Override
    public void enviar(Pedido pedido) {
        throw new IllegalStateException("❌ El pedido ya fue entregado.");
    }

    @Override
    public void entregar(Pedido pedido) {
        throw new IllegalStateException("❌ El pedido ya fue entregado.");
    }

    @Override
    public void cancelar(Pedido pedido) {
        throw new IllegalStateException("❌ No se puede cancelar un pedido ya entregado.");
    }

    @Override
    public String nombre() {
        return "ENTREGADO";
    }
}

