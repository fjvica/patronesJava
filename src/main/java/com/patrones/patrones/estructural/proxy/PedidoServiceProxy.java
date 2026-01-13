package com.patrones.patrones.estructural.proxy;

import org.springframework.stereotype.Service;

@Service
public class PedidoServiceProxy implements PedidoService {

    private final PedidoServiceImpl pedidoService;

    public PedidoServiceProxy(PedidoServiceImpl pedidoService) {
        this.pedidoService = pedidoService;
    }

    @Override
    public void crearPedido(Pedido pedido) {
        // Funcionalidad adicional antes de llamar al servicio real
        System.out.println("LOG: Se está creando un pedido con ID " + pedido.getId());

        // Llamada al servicio real
        pedidoService.crearPedido(pedido);

        // Funcionalidad adicional después
        System.out.println("LOG: Pedido con ID " + pedido.getId() + " creado correctamente");
    }
}

