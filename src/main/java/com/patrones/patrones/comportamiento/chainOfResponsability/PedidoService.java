package com.patrones.patrones.comportamiento.chainOfResponsability;

import org.springframework.stereotype.Service;

/**
 * Servicio que construye la cadena y ejecuta el flujo completo de validación.
 */
@Service
public class PedidoService {

    private final PedidoHandler cadena;

    public PedidoService() {
        // Construcción de la cadena: orden lógico de validaciones
        this.cadena = new ClienteExistenteHandler();
        PedidoHandler stock = cadena.setNextHandler(new StockDisponibleHandler());
        stock.setNextHandler(new LimitePedidoHandler());
    }

    /**
     * Procesa un pedido pasando por toda la cadena de validaciones.
     */
    public void procesarPedido(PedidoRequest pedido) {
        System.out.println("🚀 Iniciando validaciones del pedido...");
        cadena.handle(pedido);
        System.out.println("🎉 Pedido validado y procesado correctamente.");
    }
}
