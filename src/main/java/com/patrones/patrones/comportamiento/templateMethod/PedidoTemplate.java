package com.patrones.patrones.comportamiento.templateMethod;

/**
 * Clase abstracta que define el algoritmo de procesamiento de un pedido.
 * Metodo plantilla: processOrder()
 */
public abstract class PedidoTemplate {

    // Método plantilla: define la estructura general del algoritmo
    public final void procesarPedido(Long pedidoId) {
        validarPedido(pedidoId);       // paso obligatorio: validación
        aplicarDescuento(pedidoId);    // paso opcional: depende del tipo de pedido
        cobrarPedido(pedidoId);        // paso obligatorio: cobro
        enviarConfirmacion(pedidoId);  // paso obligatorio: notificación
        accionesExtra(pedidoId);       // hook opcional para cada subclase
    }

    // Paso obligatorio, implementado por subclases
    protected abstract void validarPedido(Long pedidoId);

    // Paso opcional: puede tener implementación vacía en la base
    protected void aplicarDescuento(Long pedidoId) {
        // Por defecto no hace nada
    }

    // Paso obligatorio: implementación común
    protected void cobrarPedido(Long pedidoId) {
        System.out.println("Cobro del pedido " + pedidoId + " realizado.");
    }

    // Paso obligatorio: implementación común
    protected void enviarConfirmacion(Long pedidoId) {
        System.out.println("Correo de confirmación enviado para el pedido " + pedidoId);
    }

    // Hook opcional para acciones extra específicas de cada tipo de pedido
    protected void accionesExtra(Long pedidoId) {
        // implementación vacía por defecto
    }
}

