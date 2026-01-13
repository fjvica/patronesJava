package com.patrones.patrones.comportamiento.command;

/**
 * Comando concreto que encapsula la acción de preparar una hamburguesa.
 */
public class OrdenHamburguesaCommand implements Command {

    private final Cocina cocina;

    public OrdenHamburguesaCommand(Cocina cocina) {
        this.cocina = cocina;
    }

    @Override
    public void execute() {
        cocina.prepararHamburguesa();
    }

    @Override
    public void undo() {
        cocina.cancelarHamburguesa();
    }
}
