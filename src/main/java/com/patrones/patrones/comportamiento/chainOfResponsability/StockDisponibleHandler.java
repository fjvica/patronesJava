package com.patrones.patrones.comportamiento.chainOfResponsability;

/**
 * Simula la validación de stock en almacén.
 */
public class StockDisponibleHandler extends PedidoHandler {

    @Override
    public void handle(PedidoRequest pedido) {
        if (pedido.getCantidad() > 50) {
            throw new RuntimeException("Error: No hay stock suficiente.");
        }

        System.out.println("✅ Stock disponible para cantidad: " + pedido.getCantidad());

        if (nextHandler != null) {
            nextHandler.handle(pedido);
        }
    }
}

