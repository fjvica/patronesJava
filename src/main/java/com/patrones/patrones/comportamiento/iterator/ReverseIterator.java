package com.patrones.patrones.comportamiento.iterator;

import java.util.List;

/**
 * Iterador que recorre la lista de platos en orden inverso.
 */
public class ReverseIterator implements Iterator<String> {

    private final List<String> platos;
    private int posicion;

    public ReverseIterator(List<String> platos) {
        this.platos = platos;
        this.posicion = platos.size() - 1; // empezamos desde el último
    }

    @Override
    public boolean hasNext() {
        return posicion >= 0;
    }

    @Override
    public String next() {
        return platos.get(posicion--);
    }
}

