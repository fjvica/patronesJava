# Read Me First
The following was discovered as part of building this project:

* No Docker Compose services found. As of now, the application won't start! Please add at least one service to the `compose.yaml` file.

# Getting Started

### Introduccion
Todos los patrones pueden clasificarse por su propósito. Este libro cubre tres grupos generales de patrones:

Los **patrones creacionales** proporcionan mecanismos de creación de objetos que incrementan la flexibilidad y la reutilización de código existente.

Los **patrones estructurales** explican cómo ensamblar objetos y clases en estructuras más grandes a la vez que se mantiene la flexibilidad y eficiencia de la estructura.

Los **patrones de comportamiento** se encargan de una comunicación efectiva y la asignación de responsabilidades entre objetos.


### Patrones creacionales

| Patrón               | Qué crea                                                      | Nivel de abstracción     | Explicación breve                                                                                                    | Ejemplo mental                                                                                                     |
| -------------------- | ------------------------------------------------------------- | ------------------------ | ------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------ |
| **Factory Method**   | Un único tipo de objeto (una instancia concreta)             | Método individual        | Permite crear un objeto sin exponer la lógica de creación al cliente.                                               | Una fábrica de coches que fabrica un solo modelo de coche                                                          |
| **Abstract Factory** | Una familia de objetos relacionados (coherentes entre sí)    | Conjunto de fábricas     | Permite crear familias completas de objetos relacionados sin acoplar al cliente con clases concretas.              | Una fábrica de coches que fabrica varios modelos compatibles entre sí (motor, chasis, ruedas del mismo tipo)     |
| **Builder**          | Un objeto complejo paso a paso con muchos parámetros         | Constructor flexible     | Permite construir objetos complejos paso a paso, con campos obligatorios y opcionales, de forma clara y segura.    | Crear un usuario o un mensaje de notificación con múltiples campos opcionales y valores por defecto              |
