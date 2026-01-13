package com.patrones.patrones.comportamiento.chainOfResponsability;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Ejemplo completo del patrón Chain of Responsibility aplicado en Spring Boot.
 */
@SpringBootApplication
public class CadenaResponsabilidadApplication implements CommandLineRunner {

    private final PedidoService pedidoService;

    public CadenaResponsabilidadApplication(PedidoService pedidoService) {
        this.pedidoService = pedidoService;
    }

    public static void main(String[] args) {
        SpringApplication.run(CadenaResponsabilidadApplication.class, args);
    }

    @Override
    public void run(String... args) {
        PedidoRequest pedido = new PedidoRequest("cliente-123", 20, 1200);
        pedidoService.procesarPedido(pedido);
    }
}

