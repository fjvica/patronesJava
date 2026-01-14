package com.patrones.patrones.comportamiento.memento;

import java.time.LocalDateTime;

/**
 * ORIGINATOR:
 * Representa un documento editable cuyo estado queremos versionar.
 */
public class Documento {
    private String titulo;
    private String contenido;
    private LocalDateTime ultimaModificacion;

    public Documento(String titulo, String contenido) {
        this.titulo = titulo;
        this.contenido = contenido;
        this.ultimaModificacion = LocalDateTime.now();
    }

    public void escribir(String nuevoTexto) {
        this.contenido += "\n" + nuevoTexto;
        this.ultimaModificacion = LocalDateTime.now();
    }

    public DocumentoMemento guardar() {
        return new DocumentoMemento(titulo, contenido, ultimaModificacion);
    }

    public void restaurar(DocumentoMemento memento) {
        this.titulo = memento.getTitulo();
        this.contenido = memento.getContenido();
        this.ultimaModificacion = memento.getFecha();
    }

    public String mostrar() {
        return """
                📄 %s
                Última modificación: %s
                Contenido:
                %s
                """.formatted(titulo, ultimaModificacion, contenido);
    }
}

