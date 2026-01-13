package com.patrones.patrones.comportamiento.command;

public class OrdenEnsaladaCommand implements Command {

    private final Cocina cocina;

    public OrdenEnsaladaCommand(Cocina cocina) {
        this.cocina = cocina;
    }

    @Override
    public void execute() {
        cocina.prepararEnsalada();
    }

    @Override
    public void undo() {
        cocina.cancelarEnsalada();
    }
}

