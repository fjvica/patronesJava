package com.patrones.patrones.comportamiento.chainOfResponsability;

/**
 * Clase abstracta que define la estructura de un "Handler" dentro de la cadena.
 *
 * Cada Handler decide si procesa el pedido o lo pasa al siguiente.
 */
public abstract class PedidoHandler {

    protected PedidoHandler nextHandler;

    /**
     * Asigna el siguiente Handler en la cadena.
     */
    public PedidoHandler setNextHandler(PedidoHandler nextHandler) {
        this.nextHandler = nextHandler;
        return nextHandler; // Permite encadenar con fluidez
    }

    /**
     * Metodo que las subclases deben implementar para procesar o delegar.
     */
    public abstract void handle(PedidoRequest pedido);
}

