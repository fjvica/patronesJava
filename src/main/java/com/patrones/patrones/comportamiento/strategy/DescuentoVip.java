package com.patrones.patrones.comportamiento.strategy;

import org.springframework.stereotype.Component;

/**
 * Estrategia para clientes VIP.
 */
@Component("vip")
public class DescuentoVip implements DescuentoStrategy {

    @Override
    public double aplicarDescuento(double total) {
        return total * 0.90; // 10% descuento
    }

    @Override
    public String nombre() {
        return "VIP (10%)";
    }
}

