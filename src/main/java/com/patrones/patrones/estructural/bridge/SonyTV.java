package com.patrones.patrones.estructural.bridge;

import org.springframework.stereotype.Component;

@Component // Bean opcional, inyectable si se desea
public class SonyTV implements TV {

    @Override
    public void on() { System.out.println("Sony TV encendida"); }

    @Override
    public void off() { System.out.println("Sony TV apagada"); }

    @Override
    public void tuneChannel(int channel) { System.out.println("Sony TV sintoniza canal " + channel); }
}

