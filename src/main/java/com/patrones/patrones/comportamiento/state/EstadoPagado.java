package com.patrones.patrones.comportamiento.state;


public class EstadoPagado implements EstadoPedido {

    @Override
    public void pagar(Pedido pedido) {
        throw new IllegalStateException("❌ El pedido ya está pagado.");
    }

    @Override
    public void enviar(Pedido pedido) {
        pedido.setEstado(new EstadoEnviado());
        System.out.println("📦 Pedido enviado correctamente.");
    }

    @Override
    public void entregar(Pedido pedido) {
        throw new IllegalStateException("❌ No se puede entregar sin haber sido enviado.");
    }

    @Override
    public void cancelar(Pedido pedido) {
        pedido.setEstado(new EstadoCancelado());
        System.out.println("⚠️ Pedido cancelado tras el pago. Se iniciará reembolso.");
    }

    @Override
    public String nombre() {
        return "PAGADO";
    }
}

