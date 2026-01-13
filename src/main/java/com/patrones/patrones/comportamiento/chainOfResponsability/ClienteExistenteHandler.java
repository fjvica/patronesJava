package com.patrones.patrones.comportamiento.chainOfResponsability;

/**
 * Verifica que el cliente exista en el sistema antes de continuar.
 */
public class ClienteExistenteHandler extends PedidoHandler {

    @Override
    public void handle(PedidoRequest pedido) {
        if (pedido.getClienteId() == null || pedido.getClienteId().isEmpty()) {
            throw new RuntimeException("Error: Cliente no válido o no existente.");
        }

        System.out.println("✅ Cliente válido: " + pedido.getClienteId());

        // Si hay siguiente en la cadena, delegamos
        if (nextHandler != null) {
            nextHandler.handle(pedido);
        }
    }
}

