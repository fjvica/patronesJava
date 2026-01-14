package com.patrones.patrones.comportamiento.mediator;

import org.springframework.stereotype.Service;

/**
 * Componente que gestiona la disponibilidad de productos.
 */
@Service
public class InventarioService extends Colleague {

    public boolean verificarStock(Long productoId, int cantidad) {
        System.out.println("Inventario: verificando stock del producto " + productoId);
        // Simulación: siempre hay stock disponible
        return true;
    }

    public void reservarStock(Long productoId, int cantidad) {
        System.out.println("Inventario: reservando stock...");
    }
}

