package com.patrones.patrones.comportamiento.observer;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * Observador que reacciona al evento actualizando el inventario.
 */
@Component
public class ActualizacionInventarioListener {

    @EventListener
    public void manejar(PedidoCreadoEvent evento) {
        System.out.println("🏬 Actualizando inventario para pedido: " + evento.getPedido().getId());
    }
}

