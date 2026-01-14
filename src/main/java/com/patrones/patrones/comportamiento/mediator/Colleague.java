package com.patrones.patrones.comportamiento.mediator;

/**
 * Clase base para todos los componentes (colegas)
 * que colaboran a través del Mediador.
 */
public abstract class Colleague {
    protected Mediator mediator;

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }
}

