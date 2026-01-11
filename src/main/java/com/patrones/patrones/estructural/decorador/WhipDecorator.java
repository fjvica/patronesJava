package com.patrones.patrones.estructural.decorador;

import org.springframework.stereotype.Component;

@Component
public class WhipDecorator extends BeverageDecorator {

    public WhipDecorator(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        // Añade "nata" a la descripción existente
        return beverage.getDescription() + ", con nata";
    }

    @Override
    public double getCost() {
        // Añade 0.7 € al coste del café original
        return beverage.getCost() + 0.7;
    }
}

