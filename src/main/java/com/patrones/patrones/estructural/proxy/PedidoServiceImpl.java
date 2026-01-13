package com.patrones.patrones.estructural.proxy;

import org.springframework.stereotype.Service;

@Service
public class PedidoServiceImpl implements PedidoService {

    @Override
    public void crearPedido(Pedido pedido) {
        // Aquí iría la lógica real de guardar el pedido en base de datos
        System.out.println("Pedido creado: " + pedido.getDescripcion());
    }
}

