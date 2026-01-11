package com.patrones.patrones.estructural.decorador;

import org.springframework.stereotype.Component;

@Component
public class Coffee implements Beverage {

    @Override
    public String getDescription() {
        return "Café base";
    }

    @Override
    public double getCost() {
        return 2.0; // Precio base del café
    }
}
