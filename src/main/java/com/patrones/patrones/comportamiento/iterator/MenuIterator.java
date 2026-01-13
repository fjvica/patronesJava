package com.patrones.patrones.comportamiento.iterator;

import java.util.List;

/**
 * Iterador estándar que recorre la lista de platos en orden normal.
 */
public class MenuIterator implements Iterator<String> {

    private final List<String> platos;
    private int posicion = 0; // posición actual del iterador

    public MenuIterator(List<String> platos) {
        this.platos = platos;
    }

    @Override
    public boolean hasNext() {
        // Hay siguiente si la posición es menor al tamaño de la lista
        return posicion < platos.size();
    }

    @Override
    public String next() {
        // Devuelve el plato actual y avanza la posición
        return platos.get(posicion++);
    }
}

