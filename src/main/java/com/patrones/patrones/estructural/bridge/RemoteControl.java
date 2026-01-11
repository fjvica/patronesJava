package com.patrones.patrones.estructural.bridge;

/*
    Abstracción (Abstraction)
    Representa la interfaz principal que el cliente conoce y usa.
    Contiene la referencia a la implementación (generalmente como un atributo).
    Define los métodos de alto nivel que el cliente puede llamar.
    Claves de la Abstracción:
    No sabe cómo se hacen realmente las cosas, solo qué se debe hacer.
    Depende de una implementación concreta para ejecutar los métodos.
    Puede tener subclases que extiendan la funcionalidad sin tocar la implementación.
    Ejemplo en nuestro caso del control remoto:
*/
/*
    RemoteControl es la Abstracción: el cliente solo conoce estos métodos (turnOn, turnOff, setChannel).
    No le importa si es un SonyTV o un SamsungTV.
 */
// Abstracción que define los métodos de alto nivel
public abstract class RemoteControl {

    // Referencia a la Implementación (Bridge)
    protected TV implementor;

    protected RemoteControl(TV implementor) {
        this.implementor = implementor;
    }

    // Métodos que el cliente puede usar
    public abstract void turnOn();
    public abstract void turnOff();
    public abstract void setChannel(int channel);
}

