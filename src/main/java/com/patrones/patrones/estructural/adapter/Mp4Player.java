package com.patrones.patrones.estructural.adapter;

import org.springframework.stereotype.Component;

@Component // Bean de Spring para inyección automática
public class Mp4Player {

    // Método específico que reproduce archivos MP4
    public void playMp4(String fileName) {
        System.out.println("Reproduciendo mp4: " + fileName);
    }
}
