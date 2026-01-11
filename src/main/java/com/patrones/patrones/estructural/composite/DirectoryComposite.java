package com.patrones.patrones.estructural.composite;

import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.List;

@Component
public class DirectoryComposite implements FileSystemComponent {

    private String name; // Nombre del directorio
    private List<FileSystemComponent> components = new ArrayList<>(); // Archivos y subdirectorios

    public DirectoryComposite(String name) {
        this.name = name;
    }

    // Agregar un componente (archivo o subdirectorio)
    public void addComponent(FileSystemComponent component) {
        components.add(component);
    }

    // Eliminar un componente
    public void removeComponent(FileSystemComponent component) {
        components.remove(component);
    }

    @Override
    public void showDetails() {
        // Mostrar el nombre del directorio
        System.out.println("Directorio: " + name);
        // Mostrar todos los componentes recursivamente
        for (FileSystemComponent component : components) {
            component.showDetails(); // Llamada recursiva
        }
    }
}

