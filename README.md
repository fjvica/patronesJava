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

| Patrón               | Qué crea                                                      | Nivel de abstracción     | Ejemplo mental                                                                                                     |
| -------------------- | ------------------------------------------------------------- | ------------------------ | ------------------------------------------------------------------------------------------------------------------ |
| **Factory Method**   | Un único tipo de objeto (una *instancia concreta*)            | **Método individual**    | Una *fábrica de coches* que fabrica **un solo modelo** de coche                                                    |
| **Abstract Factory** | **Una familia de objetos relacionados** (coherentes entre sí) | **Conjunto de fábricas** | Una *fábrica de coches* que fabrica **varios modelos compatibles entre sí** (motor, chasis, ruedas del mismo tipo) |
