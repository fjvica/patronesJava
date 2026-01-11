package com.patrones.patrones.creacional.singleton;

public class Main {
    public static void main(String[] args) {
        Impresora p1 = Impresora.getInstance();
        Impresora p2 = Impresora.getInstance();

        System.out.println(p1 == p2); // true → misma instancia
        p1.imprimir("Documento 1");
        p2.imprimir("Documento 2");
    }
}

