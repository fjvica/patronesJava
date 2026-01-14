package com.patrones.patrones.comportamiento.observer;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {

    private final PedidoService servicio;

    public PedidoController(PedidoService servicio) {
        this.servicio = servicio;
    }

    @PostMapping
    public Pedido crear(@RequestParam Long id, @RequestParam String cliente) {
        return servicio.crearPedido(id, cliente);
    }
}

