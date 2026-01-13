package com.patrones.patrones.comportamiento.command;

/**
 * Interfaz base de todos los comandos.
 * Cada orden sabe cómo ejecutarse y cómo deshacerse.
 */
public interface Command {
    void execute();  // Ejecuta la acción
    void undo();     // Deshace la acción
}

