package com.patrones.patrones.comportamiento.command;

import org.springframework.stereotype.Component;

/**
 * La Cocina sabe cómo preparar cada tipo de comida.
 * Aquí está la "lógica de negocio real".
 */
@Component
public class Cocina {

    public void prepararHamburguesa() {
        System.out.println("🍔 Preparando hamburguesa...");
    }

    public void cancelarHamburguesa() {
        System.out.println("↩️ Cancelando hamburguesa...");
    }

    public void prepararRefresco() {
        System.out.println("🥤 Preparando refresco...");
    }

    public void cancelarRefresco() {
        System.out.println("↩️ Cancelando refresco...");
    }

    public void prepararEnsalada() {
        System.out.println("🥗 Preparando ensalada...");
    }

    public void cancelarEnsalada() {
        System.out.println("↩️ Cancelando ensalada...");
    }
}

