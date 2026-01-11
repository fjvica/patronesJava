package com.patrones.patrones.estructural.bridge;

/*
    Implementación (Implementor)
    Define cómo se realizan realmente las operaciones.
    Puede haber varias implementaciones concretas que cumplan la misma interfaz.
    Es independiente de la abstracción; puedes añadir nuevas implementaciones sin modificar la abstracción.
 */
// Interfaz de Implementación
public interface TV {
    void on();
    void off();
    void tuneChannel(int channel);
}

