package com.patrones.patrones.estructural.decorador;

import org.springframework.stereotype.Component;

@Component
public class MilkDecorator extends BeverageDecorator {

    public MilkDecorator(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        // Añade "leche" a la descripción existente
        return beverage.getDescription() + ", con leche";
    }

    @Override
    public double getCost() {
        // Añade 0.5 € al coste del café original
        return beverage.getCost() + 0.5;
    }
}

