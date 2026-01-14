package com.patrones.patrones.comportamiento.visitor;

import org.springframework.stereotype.Component;

/**
 * Visitor concreto que genera reportes de pedidos.
 * Implementa las operaciones definidas en PedidoVisitor.
 */
@Component
public class ReporteVisitor implements PedidoVisitor {

    @Override
    public void visitar(PedidoNormal pedido) {
        // Acciones específicas para pedido normal
        System.out.println("Generando reporte para pedido normal: ID="
                + pedido.getId() + ", Total=" + pedido.getTotal());
    }

    @Override
    public void visitar(PedidoVIP pedido) {
        // Acciones específicas para pedido VIP
        System.out.println("Generando reporte para pedido VIP: ID="
                + pedido.getId() + ", Total=" + pedido.getTotal());
    }
}

