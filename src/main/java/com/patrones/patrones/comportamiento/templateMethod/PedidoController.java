package com.patrones.patrones.comportamiento.templateMethod;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PedidoController {

    private final ProcesadorPedidosService servicio;
    private final PedidoNormal pedidoNormal;
    private final PedidoVIP pedidoVIP;

    public PedidoController(ProcesadorPedidosService servicio, PedidoNormal pedidoNormal, PedidoVIP pedidoVIP) {
        this.servicio = servicio;
        this.pedidoNormal = pedidoNormal;
        this.pedidoVIP = pedidoVIP;
    }

    @GetMapping("/procesar-normal")
    public String procesarNormal() {
        servicio.procesarPedido(pedidoNormal, 101L);
        return "Pedido normal procesado";
    }

    @GetMapping("/procesar-vip")
    public String procesarVIP() {
        servicio.procesarPedido(pedidoVIP, 202L);
        return "Pedido VIP procesado";
    }
}

