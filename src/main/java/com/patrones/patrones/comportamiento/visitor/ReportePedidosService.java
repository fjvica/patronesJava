package com.patrones.patrones.comportamiento.visitor;

import org.springframework.stereotype.Service;

/**
 * Servicio que permite generar reportes usando el patrón Visitor.
 */
@Service
public class ReportePedidosService {

    /**
     * Genera un reporte de un pedido.
     *
     * @param pedido  El pedido (Elemento) que será visitado
     * @param visitor El visitor que aplicará la operación
     */
    public void generarReporte(PedidoElemento pedido, PedidoVisitor visitor) {
        // Se llama al metodo aceptar del pedido.
        // Este delega la acción al visitor según el tipo real de pedido.
        pedido.aceptar(visitor);
    }
}

