package com.patrones.patrones.comportamiento.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * Implementación concreta del menú del restaurante.
 * Mantiene una lista de platos y un flag si son vegetarianos.
 */
public class MenuRestaurante implements Menu {

    private final List<String> platos = new ArrayList<>();
    private final List<Boolean> esVegetariano = new ArrayList<>();

    /**
     * Agrega un plato al menú indicando si es vegetariano o no.
     * @param plato Nombre del plato
     * @param vegetariano true si es vegetariano, false si no
     */
    public void addPlato(String plato, boolean vegetariano) {
        platos.add(plato);
        esVegetariano.add(vegetariano);
    }

    @Override
    public Iterator<String> createIterator() {
        return new MenuIterator(platos);
    }

    @Override
    public Iterator<String> createVegetarianoIterator() {
        return new VegetarianoIterator(platos, esVegetariano);
    }

    @Override
    public Iterator<String> createReverseIterator() {
        return new ReverseIterator(platos);
    }
}
