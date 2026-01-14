package com.patrones.patrones.comportamiento.mediator;

/**
 * Interfaz del Mediador: define el contrato
 * para la comunicación entre componentes.
 */
public interface Mediator {
    void notificar(Object sender, String evento);
}

