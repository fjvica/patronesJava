package com.patrones.patrones.comportamiento.memento;

import org.springframework.stereotype.Service;

import java.util.Stack;

/**
 * CARETAKER:
 * Administra las versiones del documento.
 */
@Service
public class GestorVersiones {

    private final Stack<DocumentoMemento> historial = new Stack<>();

    public void guardarVersion(Documento documento) {
        historial.push(documento.guardar());
    }

    public void deshacer(Documento documento) {
        if (historial.isEmpty()) {
            System.out.println("⚠️ No hay versiones para restaurar.");
            return;
        }
        DocumentoMemento memento = historial.pop();
        documento.restaurar(memento);
        System.out.println("↩️ Documento restaurado a versión del " + memento.getFecha());
    }

    public int totalVersiones() {
        return historial.size();
    }
}

