package com.patrones.patrones.comportamiento.iterator;

import java.util.List;

/**
 * Iterador que recorre únicamente los platos vegetarianos.
 * Implementa lógica de filtrado dentro del iterador.
 */
public class VegetarianoIterator implements Iterator<String> {

    private final List<String> platos;
    private final List<Boolean> esVegetariano;
    private int posicion = 0; // posición actual

    public VegetarianoIterator(List<String> platos, List<Boolean> esVegetariano) {
        this.platos = platos;
        this.esVegetariano = esVegetariano;
        // Avanza hasta el primer vegetariano
        avanzarHaciaSiguienteVegetariano();
    }

    /**
     * Salta posiciones hasta encontrar un plato vegetariano.
     */
    private void avanzarHaciaSiguienteVegetariano() {
        while (posicion < platos.size() && !esVegetariano.get(posicion)) {
            posicion++;
        }
    }

    @Override
    public boolean hasNext() {
        return posicion < platos.size();
    }

    @Override
    public String next() {
        String plato = platos.get(posicion);
        posicion++;
        avanzarHaciaSiguienteVegetariano(); // saltar al próximo vegetariano
        return plato;
    }
}

