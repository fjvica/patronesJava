package com.patrones.patrones.estructural.composite;

import org.springframework.stereotype.Component;

@Component // Bean opcional, permite inyección si se desea
public class FileLeaf implements FileSystemComponent {

    private String name;
    private int size; // Tamaño en KB

    public FileLeaf(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public void showDetails() {
        // Mostrar información del archivo
        System.out.println("Archivo: " + name + " (" + size + "KB)");
    }
}
