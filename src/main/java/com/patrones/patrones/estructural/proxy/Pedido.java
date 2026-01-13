package com.patrones.patrones.estructural.proxy;

public class Pedido {
    private Long id;
    private String descripcion;

    public Pedido(Long id, String descripcion) {
        this.id = id;
        this.descripcion = descripcion;
    }

    public Long getId() { return id; }
    public String getDescripcion() { return descripcion; }
}

