package com.patrones.patrones.comportamiento.chainOfResponsability;

/**
 * DTO (Data Transfer Object) que representa una solicitud de pedido.
 */
public class PedidoRequest {
    private String clienteId;
    private int cantidad;
    private double total;

    public PedidoRequest(String clienteId, int cantidad, double total) {
        this.clienteId = clienteId;
        this.cantidad = cantidad;
        this.total = total;
    }

    public String getClienteId() { return clienteId; }
    public int getCantidad() { return cantidad; }
    public double getTotal() { return total; }
}

