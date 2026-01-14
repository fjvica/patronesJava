package com.patrones.patrones.comportamiento.visitor;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controlador para probar el patrón Visitor con pedidos.
 */
@RestController
public class PedidoVisitorController {

    private final ReportePedidosService servicio;
    private final PedidoNormal pedidoNormal;
    private final PedidoVIP pedidoVIP;
    private final ReporteVisitor visitor;

    public PedidoVisitorController(ReportePedidosService servicio,
                                   PedidoNormal pedidoNormal,
                                   PedidoVIP pedidoVIP,
                                   ReporteVisitor visitor) {
        this.servicio = servicio;
        this.pedidoNormal = pedidoNormal;
        this.pedidoVIP = pedidoVIP;
        this.visitor = visitor;
    }

    /**
     * Endpoint para generar reporte de un pedido normal
     */
    @GetMapping("/reporte-normal")
    public String reporteNormal() {
        servicio.generarReporte(pedidoNormal, visitor);
        return "Reporte de pedido normal generado";
    }

    /**
     * Endpoint para generar reporte de un pedido VIP
     */
    @GetMapping("/reporte-vip")
    public String reporteVIP() {
        servicio.generarReporte(pedidoVIP, visitor);
        return "Reporte de pedido VIP generado";
    }
}

