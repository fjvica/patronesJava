package com.patrones.patrones.comportamiento.strategy;

import org.springframework.stereotype.Component;

/**
 * Estrategia por defecto: sin descuento.
 */
@Component("normal")
public class DescuentoNormal implements DescuentoStrategy {

    @Override
    public double aplicarDescuento(double total) {
        return total; // No hay descuento
    }

    @Override
    public String nombre() {
        return "NORMAL (0%)";
    }
}

