package com.patrones.patrones.creacional.prototype;

public class Reporte implements Cloneable {

    private String titulo;
    private String contenido;
    private String autor;

    public Reporte(String titulo, String contenido, String autor) {
        this.titulo = titulo;
        this.contenido = contenido;
        this.autor = autor;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public void mostrar() {
        System.out.println("📄 " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Contenido: " + contenido);
        System.out.println();
    }

    @Override
    public Reporte clone() {
        try {
            return (Reporte) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError("Clonación no soportada");
        }
    }
}
