package com.patrones.patrones.estructural.flyweight;

// Clase que representa el objeto Flyweight (compartido entre múltiples instancias)
public class Icon {

    // Estado intrínseco: parte compartida entre muchos iconos
    private final String type;
    private final String imagePath; // podría representar una ruta, sprite, etc.

    public Icon(String type, String imagePath) {
        this.type = type;
        this.imagePath = imagePath;
    }

    // Metodo que usa el estado extrínseco (posición) al dibujar el icono
    public void draw(int x, int y) {
        System.out.println("Dibujando icono [" + type + "] desde " + imagePath +
                " en posición (" + x + ", " + y + ")");
    }
}

