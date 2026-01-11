package com.patrones.patrones.estructural.adapter;

import org.springframework.stereotype.Component;

@Component // Se inyecta automáticamente donde se necesite
public class MediaAdapter implements MediaPlayer {

    private final Mp4Player mp4Player;

    // Constructor: recibe el Mp4Player que se va a adaptar
    public MediaAdapter(Mp4Player mp4Player) {
        this.mp4Player = mp4Player;
    }

    // Implementación de la interfaz MediaPlayer
    @Override
    public void play(String audioType, String fileName) {
        // Solo se adapta el tipo "mp4"
        if(audioType.equalsIgnoreCase("mp4")) {
            mp4Player.playMp4(fileName); // Llama al método original de Mp4Player
        }
    }
}


