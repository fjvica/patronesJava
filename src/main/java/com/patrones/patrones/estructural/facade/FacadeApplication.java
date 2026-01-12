package com.patrones.patrones.estructural.facade;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FacadeApplication {

    public static void main(String[] args) {
        SpringApplication.run(FacadeApplication.class, args);
    }

    // Ejecutamos el ejemplo al iniciar la app
    @org.springframework.context.annotation.Bean
    CommandLineRunner run(OrderFacade orderFacade) {
        return args -> {
            System.out.println("=== Iniciando compra ===");
            orderFacade.placeOrder("producto-123", 2, "1234-5678-9012-3456");
            System.out.println("=== Compra finalizada ===");
        };
    }
}
