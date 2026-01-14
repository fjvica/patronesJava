package com.patrones.patrones.comportamiento.strategy;

import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * Servicio que usa el patrón Strategy para aplicar el descuento adecuado.
 */
@Service
public class CalculadoraDescuentoService {

    // Spring inyecta automáticamente todas las estrategias con su nombre de @Component
    private final Map<String, DescuentoStrategy> estrategias;

    public CalculadoraDescuentoService(Map<String, DescuentoStrategy> estrategias) {
        this.estrategias = estrategias;
    }

    public double calcularPrecioFinal(Pedido pedido) {
        // Se selecciona la estrategia según el tipo de cliente
        DescuentoStrategy estrategia = estrategias.getOrDefault(pedido.getClienteTipo(), estrategias.get("normal"));

        System.out.println("Aplicando estrategia: " + estrategia.nombre());
        return estrategia.aplicarDescuento(pedido.getTotal());
    }

    public String estrategiaUsada(Pedido pedido) {
        return estrategias.getOrDefault(pedido.getClienteTipo(), estrategias.get("normal")).nombre();
    }
}

