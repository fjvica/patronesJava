package com.patrones.patrones.estructural.flyweight;

import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

// Clase cliente que maneja la lógica de los iconos "colocados" en pantalla
@Service
public class IconManager {

    private final IconFactory factory;
    private final List<String> placedIcons = new ArrayList<>();

    // Se inyecta la fábrica (Spring lo hace automáticamente)
    public IconManager(IconFactory factory) {
        this.factory = factory;
    }

    // Coloca un icono en una posición dada
    public void placeIcon(String type, int x, int y) {
        // Obtiene (o reutiliza) el flyweight desde la fábrica
        Icon icon = factory.getIcon(type);

        // Dibuja el icono usando el estado extrínseco (posición)
        icon.draw(x, y);

        // Guarda un registro lógico del icono colocado
        placedIcons.add(type + "@" + x + "," + y);
    }

    // Muestra información sobre cuántos objetos se han creado y reutilizado
    public void printCacheSize() {
        System.out.println("Número de iconos únicos en caché: " + factory.getCacheSize());
        System.out.println("Número total de iconos colocados: " + placedIcons.size());
    }
}

