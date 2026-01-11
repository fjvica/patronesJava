package com.patrones.patrones.estructural.bridge;

import org.springframework.stereotype.Component;

@Component
public class SamsungTV implements TV {

    @Override
    public void on() { System.out.println("Samsung TV encendida"); }

    @Override
    public void off() { System.out.println("Samsung TV apagada"); }

    @Override
    public void tuneChannel(int channel) { System.out.println("Samsung TV sintoniza canal " + channel); }
}

