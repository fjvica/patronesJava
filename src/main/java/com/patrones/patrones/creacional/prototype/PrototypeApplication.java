package com.patrones.patrones.creacional.prototype;

public class PrototypeApplication {
    public static void main(String[] args) {

        // Creamos un objeto "prototipo"
        Reporte prototipo = new Reporte(
                "Informe mensual",
                "Datos de rendimiento del mes anterior",
                "Departamento de Análisis"
        );

        // Clonamos el prototipo para crear variaciones
        Reporte copia1 = prototipo.clone();
        copia1.setContenido("Datos de enero actualizados");

        Reporte copia2 = prototipo.clone();
        copia2.setContenido("Datos de febrero actualizados");

        // Mostramos cada uno
        System.out.println("== Original ==");
        prototipo.mostrar();

        System.out.println("== Copia 1 ==");
        copia1.mostrar();

        System.out.println("== Copia 2 ==");
        copia2.mostrar();
    }
}
