package com.patrones.patrones.creacional.singleton;

public class Impresora {

    // Instancia única privada
    private static Impresora instancia;

    // Constructor privado evita instanciación externa
    private Impresora() {
        System.out.println("Impresora creada");
    }

    // Méthod de acceso público
    public static synchronized Impresora getInstance() {
        if (instancia == null) {
            instancia = new Impresora();
        }
        return instancia;
    }

    public void imprimir(String documento) {
        System.out.println("Imprimiendo: " + documento);
    }
}

