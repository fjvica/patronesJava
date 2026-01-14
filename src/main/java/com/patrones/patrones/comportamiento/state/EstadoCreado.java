package com.patrones.patrones.comportamiento.state;

public class EstadoCreado implements EstadoPedido {

    @Override
    public void pagar(Pedido pedido) {
        pedido.setEstado(new EstadoPagado());
        System.out.println("✅ Pedido pagado correctamente. Ahora está en estado PAGADO.");
    }

    @Override
    public void enviar(Pedido pedido) {
        throw new IllegalStateException("❌ No se puede enviar un pedido que aún no está pagado.");
    }

    @Override
    public void entregar(Pedido pedido) {
        throw new IllegalStateException("❌ No se puede entregar un pedido que aún no se ha enviado.");
    }

    @Override
    public void cancelar(Pedido pedido) {
        pedido.setEstado(new EstadoCancelado());
        System.out.println("⚠️ Pedido cancelado antes de pagar.");
    }

    @Override
    public String nombre() {
        return "CREADO";
    }
}

