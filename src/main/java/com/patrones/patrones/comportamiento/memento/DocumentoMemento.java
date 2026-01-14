package com.patrones.patrones.comportamiento.memento;

import java.time.LocalDateTime;

/**
 * MEMENTO:
 * Guarda una instantánea del documento sin exponer su estructura interna.
 */
public class DocumentoMemento {
    private final String titulo;
    private final String contenido;
    private final LocalDateTime fecha;

    public DocumentoMemento(String titulo, String contenido, LocalDateTime fecha) {
        this.titulo = titulo;
        this.contenido = contenido;
        this.fecha = fecha;
    }

    public String getTitulo() { return titulo; }
    public String getContenido() { return contenido; }
    public LocalDateTime getFecha() { return fecha; }
}

