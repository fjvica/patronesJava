package com.patrones.patrones.estructural.bridge;

import org.springframework.stereotype.Component;

@Component
public class AdvancedRemote extends RemoteControl {

    public AdvancedRemote(TV implementor) {
        super(implementor);
    }

    @Override
    public void turnOn() { implementor.on(); }

    @Override
    public void turnOff() { implementor.off(); }

    @Override
    public void setChannel(int channel) { implementor.tuneChannel(channel); }

    // Método adicional exclusivo del control avanzado
    public void mute() {
        System.out.println("TV silenciada");
    }
}

