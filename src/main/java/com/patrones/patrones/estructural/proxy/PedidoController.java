package com.patrones.patrones.estructural.proxy;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {

    private final PedidoServiceProxy pedidoServiceProxy;

    public PedidoController(PedidoServiceProxy pedidoServiceProxy) {
        this.pedidoServiceProxy = pedidoServiceProxy;
    }

    @PostMapping
    public String crearPedido(@RequestParam Long id, @RequestParam String descripcion) {
        Pedido pedido = new Pedido(id, descripcion);
        pedidoServiceProxy.crearPedido(pedido);
        return "Pedido recibido";
    }
}
