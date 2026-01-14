package com.patrones.patrones.comportamiento.observer;

public class Pedido {
    private final Long id;
    private final String cliente;

    public Pedido(Long id, String cliente) {
        this.id = id;
        this.cliente = cliente;
    }

    public Long getId() { return id; }
    public String getCliente() { return cliente; }
}

