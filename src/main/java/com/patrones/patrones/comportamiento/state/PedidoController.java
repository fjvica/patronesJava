package com.patrones.patrones.comportamiento.state;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pedido")
public class PedidoController {

    private final PedidoService pedidoService;

    public PedidoController(PedidoService pedidoService) {
        this.pedidoService = pedidoService;
    }

    @GetMapping("/estado")
    public String estado() {
        return "Estado actual: " + pedidoService.estadoActual();
    }

    @PostMapping("/pagar")
    public String pagar() {
        pedidoService.pagarPedido();
        return pedidoService.estadoActual();
    }

    @PostMapping("/enviar")
    public String enviar() {
        pedidoService.enviarPedido();
        return pedidoService.estadoActual();
    }

    @PostMapping("/entregar")
    public String entregar() {
        pedidoService.entregarPedido();
        return pedidoService.estadoActual();
    }

    @PostMapping("/cancelar")
    public String cancelar() {
        pedidoService.cancelarPedido();
        return pedidoService.estadoActual();
    }
}

