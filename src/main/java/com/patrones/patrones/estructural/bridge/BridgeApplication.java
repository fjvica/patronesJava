package com.patrones.patrones.estructural.bridge;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BridgeApplication {

    public static void main(String[] args) {
        SpringApplication.run(BridgeApplication.class, args);
    }

    // Bean que ejecuta el ejemplo al iniciar la aplicación
    @org.springframework.context.annotation.Bean
    CommandLineRunner run() {
        return args -> {
            // Creamos las implementaciones concretas de TV
            SonyTV sonyTV = new SonyTV();
            SamsungTV samsungTV = new SamsungTV();

            // Creamos controles remotos que actúan como Abstracción
            RemoteControl basicRemoteSony = new BasicRemote(sonyTV);
            RemoteControl advancedRemoteSamsung = new AdvancedRemote(samsungTV);

            // Usamos el control remoto básico con Sony TV
            basicRemoteSony.turnOn();
            basicRemoteSony.setChannel(5);
            basicRemoteSony.turnOff();

            // Usamos el control remoto avanzado con Samsung TV
            advancedRemoteSamsung.turnOn();
            advancedRemoteSamsung.setChannel(10);
            ((AdvancedRemote) advancedRemoteSamsung).mute();
            advancedRemoteSamsung.turnOff();
        };
    }
}

