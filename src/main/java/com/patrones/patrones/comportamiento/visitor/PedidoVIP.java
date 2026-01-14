package com.patrones.patrones.comportamiento.visitor;

import org.springframework.stereotype.Component;

/**
 * Clase concreta que representa un pedido VIP.
 * Tiene la misma estructura que PedidoNormal, pero puede contener más campos.
 */
@Component
public class PedidoVIP implements PedidoElemento {

    private Long id = 202L;
    private double total = 200.0;

    public Long getId() { return id; }
    public double getTotal() { return total; }

    /**
     * Implementación del metodo aceptar.
     * Llama al visitor, pasando "this" para que el visitor sepa
     * que está visitando un PedidoVIP.
     */
    @Override
    public void aceptar(PedidoVisitor visitor) {
        visitor.visitar(this); // delega la acción al visitor
    }
}

