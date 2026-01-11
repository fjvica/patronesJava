package com.patrones.patrones.estructural.bridge;

import org.springframework.stereotype.Component;

@Component
public class BasicRemote extends RemoteControl {

    public BasicRemote(TV implementor) {
        super(implementor);
    }

    @Override
    public void turnOn() { implementor.on(); }

    @Override
    public void turnOff() { implementor.off(); }

    @Override
    public void setChannel(int channel) { implementor.tuneChannel(channel); }
}

