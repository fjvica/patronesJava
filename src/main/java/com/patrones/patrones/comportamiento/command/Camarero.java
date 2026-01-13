package com.patrones.patrones.comportamiento.command;

import org.springframework.stereotype.Component;

import java.util.Stack;

/**
 * El camarero recibe órdenes (Command), las ejecuta y guarda historial.
 */
@Component
public class Camarero {

    private final Stack<Command> historial = new Stack<>();

    /**
     * Ejecuta una orden y la guarda en el historial para poder deshacerla.
     */
    public void ejecutarOrden(Command command) {
        command.execute();
        historial.push(command);
    }

    /**
     * Deshace la última orden ejecutada.
     */
    public void deshacerUltimaOrden() {
        if (!historial.isEmpty()) {
            Command ultima = historial.pop();
            System.out.println("↩️ Deshaciendo última orden...");
            ultima.undo();
        } else {
            System.out.println("⚠️ No hay órdenes para deshacer.");
        }
    }
}

