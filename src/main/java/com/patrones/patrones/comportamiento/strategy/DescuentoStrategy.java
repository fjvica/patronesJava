package com.patrones.patrones.comportamiento.strategy;

/**
 * Interfaz que define el contrato para cualquier estrategia de descuento.
 */
public interface DescuentoStrategy {
    double aplicarDescuento(double total);
    String nombre();
}

