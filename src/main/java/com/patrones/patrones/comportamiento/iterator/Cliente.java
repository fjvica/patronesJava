package com.patrones.patrones.comportamiento.iterator;

public class Cliente {
    public static void main(String[] args) {

        // Creamos el menú
        MenuRestaurante menu = new MenuRestaurante();
        menu.addPlato("🍔 Hamburguesa", false);
        menu.addPlato("🥗 Ensalada", true);
        menu.addPlato("🥤 Refresco", true);
        menu.addPlato("🍰 Postre", true);
        menu.addPlato("🍗 Pollo asado", false);

        // Iterador estándar
        System.out.println("📜 Menú completo:");
        Iterator<String> iteradorCompleto = menu.createIterator();
        while (iteradorCompleto.hasNext()) {
            System.out.println(iteradorCompleto.next());
        }

        // Iterador vegetariano
        System.out.println("\n🥗 Menú vegetariano:");
        Iterator<String> iteradorVegetariano = menu.createVegetarianoIterator();
        while (iteradorVegetariano.hasNext()) {
            System.out.println(iteradorVegetariano.next());
        }

        // Iterador inverso
        System.out.println("\n🔁 Menú inverso:");
        Iterator<String> iteradorInverso = menu.createReverseIterator();
        while (iteradorInverso.hasNext()) {
            System.out.println(iteradorInverso.next());
        }
    }
}

