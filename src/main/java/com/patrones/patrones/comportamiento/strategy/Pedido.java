package com.patrones.patrones.comportamiento.strategy;

public class Pedido {
    private String clienteTipo; // "normal", "vip", "premium"
    private double total;

    public Pedido(String clienteTipo, double total) {
        this.clienteTipo = clienteTipo;
        this.total = total;
    }

    public String getClienteTipo() {
        return clienteTipo;
    }

    public double getTotal() {
        return total;
    }
}

