package com.patrones.patrones.comportamiento.state;

public class EstadoEnviado implements EstadoPedido {

    @Override
    public void pagar(Pedido pedido) {
        throw new IllegalStateException("❌ No se puede pagar un pedido ya enviado.");
    }

    @Override
    public void enviar(Pedido pedido) {
        throw new IllegalStateException("❌ El pedido ya fue enviado.");
    }

    @Override
    public void entregar(Pedido pedido) {
        pedido.setEstado(new EstadoEntregado());
        System.out.println("🎉 Pedido entregado al cliente.");
    }

    @Override
    public void cancelar(Pedido pedido) {
        throw new IllegalStateException("❌ No se puede cancelar un pedido ya enviado.");
    }

    @Override
    public String nombre() {
        return "ENVIADO";
    }
}

