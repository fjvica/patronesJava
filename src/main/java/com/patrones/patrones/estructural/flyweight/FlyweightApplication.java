package com.patrones.patrones.estructural.flyweight;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FlyweightApplication {

    public static void main(String[] args) {
        SpringApplication.run(FlyweightApplication.class, args);
    }

    // Bean que ejecuta el ejemplo automáticamente al iniciar la aplicación
    @org.springframework.context.annotation.Bean
    CommandLineRunner run(IconManager manager) {
        return args -> {
            System.out.println("=== Creando iconos ===");

            // Creamos varios iconos del mismo tipo en distintas posiciones
            manager.placeIcon("car", 10, 20);
            manager.placeIcon("car", 15, 25);
            manager.placeIcon("tree", 5, 5);
            manager.placeIcon("car", 50, 60);
            manager.placeIcon("tree", 100, 120);

            System.out.println("\n=== Resumen de objetos creados ===");
            manager.printCacheSize();
        };
    }
}

