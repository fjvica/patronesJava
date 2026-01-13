package com.patrones.patrones.comportamiento.chainOfResponsability;

/**
 * Comprueba que el total del pedido no supere un límite máximo.
 */
public class LimitePedidoHandler extends PedidoHandler {

    @Override
    public void handle(PedidoRequest pedido) {
        if (pedido.getTotal() > 5000) {
            throw new RuntimeException("Error: El pedido excede el límite permitido.");
        }

        System.out.println("✅ Total del pedido dentro del límite: " + pedido.getTotal());

        if (nextHandler != null) {
            nextHandler.handle(pedido);
        }
    }
}

