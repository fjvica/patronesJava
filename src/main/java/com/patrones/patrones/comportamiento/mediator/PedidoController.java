package com.patrones.patrones.comportamiento.mediator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controlador que simula la creación de un pedido.
 */
@RestController
public class PedidoController {

    private final PedidoMediator pedidoMediator;

    public PedidoController(PedidoMediator pedidoMediator) {
        this.pedidoMediator = pedidoMediator;
    }

    @GetMapping("/pedido")
    public String crearPedido() {
        pedidoMediator.notificar(this, "crear_pedido");
        return "Proceso de pedido ejecutado. Revisa la consola.";
    }
}

