package com.patrones.patrones.estructural.adapter;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AdapterApplication {

    public static void main(String[] args) {
        SpringApplication.run(AdapterApplication.class, args);
    }

    // Bean que se ejecuta al iniciar la aplicación para probar el reproductor
    @org.springframework.context.annotation.Bean
    CommandLineRunner run(AudioPlayer audioPlayer) {
        return args -> {
            // Reproducimos un archivo mp3 (funciona directamente)
            audioPlayer.play("mp3", "cancion.mp3");

            // Reproducimos un archivo mp4 (requiere Adapter)
            audioPlayer.play("mp4", "video.mp4");

            // Intentamos reproducir un formato no soportado
            audioPlayer.play("avi", "pelicula.avi");
        };
    }
}


