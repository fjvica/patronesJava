package com.patrones.patrones.comportamiento.visitor;

import org.springframework.stereotype.Component;

/**
 * Clase concreta que representa un pedido normal.
 * Implementa la interfaz PedidoElemento.
 */
@Component
public class PedidoNormal implements PedidoElemento {

    private Long id = 101L;       // ID del pedido
    private double total = 100.0; // Total del pedido

    public Long getId() { return id; }
    public double getTotal() { return total; }

    /**
     * Implementación del metodo aceptar.
     * Llama al visitor, pasando "this" para que el visitor sepa
     * que está visitando un PedidoNormal.
     */
    @Override
    public void aceptar(PedidoVisitor visitor) {
        visitor.visitar(this); // delega la acción al visitor
    }
}

