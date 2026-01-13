package com.patrones.patrones.comportamiento.command;

public class OrdenRefrescoCommand implements Command {

    private final Cocina cocina;

    public OrdenRefrescoCommand(Cocina cocina) {
        this.cocina = cocina;
    }

    @Override
    public void execute() {
        cocina.prepararRefresco();
    }

    @Override
    public void undo() {
        cocina.cancelarRefresco();
    }
}

