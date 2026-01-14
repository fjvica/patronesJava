package com.patrones.patrones.comportamiento.observer;


import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

/**
 * Servicio de aplicación que crea pedidos y publica el evento.
 */
@Service
public class PedidoService {

    private final ApplicationEventPublisher publisher;

    public PedidoService(ApplicationEventPublisher publisher) {
        this.publisher = publisher;
    }

    public Pedido crearPedido(Long id, String cliente) {
        Pedido pedido = new Pedido(id, cliente);

        // Publicamos el evento
        publisher.publishEvent(new PedidoCreadoEvent(pedido));

        System.out.println("✅ Pedido creado: " + id + " (" + cliente + ")");
        return pedido;
    }
}

