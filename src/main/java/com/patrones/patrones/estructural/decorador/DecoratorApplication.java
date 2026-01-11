package com.patrones.patrones.estructural.decorador;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DecoratorApplication {

    public static void main(String[] args) {
        SpringApplication.run(DecoratorApplication.class, args);
    }

    // Bean que ejecuta el ejemplo al iniciar
    @org.springframework.context.annotation.Bean
    CommandLineRunner run() {
        return args -> {
            // 1️⃣ Creamos una bebida base (café simple)
            Beverage cafe = new Coffee();

            // 2️⃣ Añadimos leche (decorador)
            cafe = new MilkDecorator(cafe);

            // 3️⃣ Añadimos nata (decorador)
            cafe = new WhipDecorator(cafe);

            // 4️⃣ Mostramos resultado final
            System.out.println("Pedido: " + cafe.getDescription());
            System.out.println("Precio total: " + cafe.getCost() + " €");
        };
    }
}

