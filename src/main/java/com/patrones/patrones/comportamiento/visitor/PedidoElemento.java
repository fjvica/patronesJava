package com.patrones.patrones.comportamiento.visitor;

/**
 * Interfaz que representa un "Elemento" que puede ser visitado por un Visitor.
 * Cada tipo de pedido implementará esta interfaz.
 */
public interface PedidoElemento {

    /**
     * Metodo que acepta un visitor.
     * Este metodo "entrega" el control al Visitor, que decidirá qué hacer según el tipo de pedido.
     *
     * @param visitor El visitor que realizará la operación
     */
    void aceptar(PedidoVisitor visitor);
}

