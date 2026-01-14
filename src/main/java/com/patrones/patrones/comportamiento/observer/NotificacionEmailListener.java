package com.patrones.patrones.comportamiento.observer;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * Observador que reacciona al evento enviando un email.
 */
@Component
public class NotificacionEmailListener {

    @EventListener
    public void manejar(PedidoCreadoEvent evento) {
        System.out.println("📧 Enviando email a cliente: " + evento.getPedido().getCliente());
    }
}

