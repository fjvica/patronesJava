package com.patrones.patrones.comportamiento.templateMethod;

import org.springframework.stereotype.Service;

@Service
public class ProcesadorPedidosService {

    public void procesarPedido(PedidoTemplate pedido, Long pedidoId) {
        pedido.procesarPedido(pedidoId); // método plantilla ejecuta todo el flujo
    }
}

