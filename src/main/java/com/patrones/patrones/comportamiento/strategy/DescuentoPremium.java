package com.patrones.patrones.comportamiento.strategy;

import org.springframework.stereotype.Component;

/**
 * Estrategia para clientes Premium.
 */
@Component("premium")
public class DescuentoPremium implements DescuentoStrategy {

    @Override
    public double aplicarDescuento(double total) {
        return total * 0.80; // 20% descuento
    }

    @Override
    public String nombre() {
        return "PREMIUM (20%)";
    }
}

