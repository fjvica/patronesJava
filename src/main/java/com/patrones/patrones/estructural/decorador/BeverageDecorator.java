package com.patrones.patrones.estructural.decorador;

// Clase abstracta que implementa la interfaz Beverage
// y mantiene una referencia al componente que decora
public abstract class BeverageDecorator implements Beverage {

    protected Beverage beverage;

    protected BeverageDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        // Delega la descripción al componente decorado
        return beverage.getDescription();
    }

    @Override
    public double getCost() {
        // Delega el coste al componente decorado
        return beverage.getCost();
    }
}

