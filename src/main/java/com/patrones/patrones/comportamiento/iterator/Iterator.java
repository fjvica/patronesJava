package com.patrones.patrones.comportamiento.iterator;

/**
 * Interfaz genérica del patrón Iterator.
 * Define las operaciones básicas para recorrer una colección.
 *
 * @param <T> Tipo de los elementos de la colección
 */
public interface Iterator<T> {

    /**
     * Comprueba si hay más elementos por recorrer.
     * @return true si hay más elementos, false si hemos llegado al final
     */
    boolean hasNext();

    /**
     * Devuelve el siguiente elemento de la colección.
     * Debe llamarse después de hasNext() para no lanzar excepción.
     * @return siguiente elemento
     */
    T next();
}

