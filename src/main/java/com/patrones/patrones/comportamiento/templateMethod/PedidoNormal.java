package com.patrones.patrones.comportamiento.templateMethod;

import org.springframework.stereotype.Component;

@Component
public class PedidoNormal extends PedidoTemplate {

    @Override
    protected void validarPedido(Long pedidoId) {
        System.out.println("Validando pedido normal: " + pedidoId);
        // reglas de validación específicas para pedido normal
    }

    @Override
    protected void aplicarDescuento(Long pedidoId) {
        System.out.println("Aplicando descuento del 5% para pedido normal: " + pedidoId);
    }
}

