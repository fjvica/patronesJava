package com.patrones.patrones.estructural.composite;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CompositeApplication {

    public static void main(String[] args) {
        SpringApplication.run(CompositeApplication.class, args);
    }

    // Bean que ejecuta el ejemplo al iniciar la aplicación
    @org.springframework.context.annotation.Bean
    CommandLineRunner run() {
        return args -> {
            // Archivos individuales (Leaf)
            FileSystemComponent file1 = new FileLeaf("archivo1.txt", 10);
            FileSystemComponent file2 = new FileLeaf("archivo2.txt", 20);

            // Subdirectorio (Composite) con archivos
            DirectoryComposite subDir = new DirectoryComposite("SubCarpeta");
            subDir.addComponent(file1);
            subDir.addComponent(file2);

            // Directorio raíz con subdirectorio y otro archivo
            DirectoryComposite rootDir = new DirectoryComposite("Raiz");
            rootDir.addComponent(subDir);
            rootDir.addComponent(new FileLeaf("archivo3.txt", 30));

            // Mostrar toda la estructura de manera uniforme
            rootDir.showDetails();
        };
    }
}
