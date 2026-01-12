package com.patrones.patrones.estructural.flyweight;

import org.springframework.stereotype.Component;
import java.util.HashMap;
import java.util.Map;

// Fábrica que crea y gestiona los objetos Flyweight compartidos
@Component
public class IconFactory {

    // Caché para guardar instancias ya creadas (clave = tipo de icono)
    private final Map<String, Icon> cache = new HashMap<>();

    // Devuelve un icono compartido según su tipo
    public Icon getIcon(String type) {
        // Si no existe aún, se crea y se añade al mapa
        if (!cache.containsKey(type)) {
            System.out.println("Creando nuevo icono de tipo: " + type);
            Icon icon = new Icon(type, "/images/" + type + ".png");
            cache.put(type, icon);
        }

        // Devuelve la instancia existente (compartida)
        return cache.get(type);
    }

    // Tamaño de la caché = número de objetos únicos creados
    public int getCacheSize() {
        return cache.size();
    }
}

