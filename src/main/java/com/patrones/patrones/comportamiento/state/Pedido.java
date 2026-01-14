package com.patrones.patrones.comportamiento.state;

import org.springframework.stereotype.Component;

@Component
public class Pedido {

    private EstadoPedido estado;

    public Pedido() {
        // Estado inicial del pedido
        this.estado = new EstadoCreado();
    }

    public void setEstado(EstadoPedido estado) {
        this.estado = estado;
    }

    public EstadoPedido getEstado() {
        return estado;
    }

    public void pagar() {
        estado.pagar(this);
    }

    public void enviar() {
        estado.enviar(this);
    }

    public void entregar() {
        estado.entregar(this);
    }

    public void cancelar() {
        estado.cancelar(this);
    }

    public String getEstadoActual() {
        return estado.nombre();
    }
}

