package com.patrones.patrones.comportamiento.templateMethod;

import org.springframework.stereotype.Component;

@Component
public class PedidoVIP extends PedidoTemplate {

    @Override
    protected void validarPedido(Long pedidoId) {
        System.out.println("Validando pedido VIP: " + pedidoId);
        // reglas de validación especiales
    }

    @Override
    protected void aplicarDescuento(Long pedidoId) {
        System.out.println("Aplicando descuento del 20% para pedido VIP: " + pedidoId);
    }

    @Override
    protected void accionesExtra(Long pedidoId) {
        System.out.println("Enviando regalo adicional para pedido VIP: " + pedidoId);
    }
}

