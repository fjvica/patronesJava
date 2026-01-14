package com.patrones.patrones.comportamiento.visitor;

/**
 * Interfaz Visitor que define las operaciones que se pueden realizar
 * sobre distintos tipos de pedidos.
 *
 * Cada tipo de pedido concreto tendrá un metodo específico.
 */
public interface PedidoVisitor {

    // Operación para PedidoNormal
    void visitar(PedidoNormal pedido);

    // Operación para PedidoVIP
    void visitar(PedidoVIP pedido);
}

