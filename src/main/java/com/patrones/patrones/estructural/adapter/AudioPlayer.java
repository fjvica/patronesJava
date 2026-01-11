package com.patrones.patrones.estructural.adapter;

import org.springframework.stereotype.Component;

@Component // Bean de Spring
public class AudioPlayer implements MediaPlayer {

    private final MediaAdapter mediaAdapter;

    // Inyección del Adapter a través del constructor
    public AudioPlayer(MediaAdapter mediaAdapter) {
        this.mediaAdapter = mediaAdapter;
    }

    @Override
    public void play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("mp3")) {
            // Archivos MP3 se reproducen directamente
            System.out.println("Reproduciendo mp3: " + fileName);
        } else if(audioType.equalsIgnoreCase("mp4")) {
            // Archivos MP4 se reproducen a través del Adapter
            mediaAdapter.play(audioType, fileName);
        } else {
            // Formatos no soportados
            System.out.println("Formato no soportado: " + audioType);
        }
    }
}


