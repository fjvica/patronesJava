package com.patrones.patrones.comportamiento.mediator;

import org.springframework.stereotype.Service;

/**
 * Componente encargado del proceso de pago.
 */
@Service
public class PagoService extends Colleague {

    public boolean procesarPago(Long pedidoId, double total) {
        System.out.println("PagoService: procesando pago para pedido " + pedidoId);
        // Simulación: el pago siempre es exitoso
        return true;
    }
}
