package com.patrones.patrones.comportamiento.iterator;

/**
 * Interfaz que define un menú genérico.
 * Permite crear diferentes iteradores según la necesidad:
 * - iterador completo
 * - iterador solo vegetarianos
 * - iterador inverso
 */
public interface Menu {

    Iterator<String> createIterator();            // Iterador estándar
    Iterator<String> createVegetarianoIterator(); // Iterador de platos vegetarianos
    Iterator<String> createReverseIterator();     // Iterador inverso
}

