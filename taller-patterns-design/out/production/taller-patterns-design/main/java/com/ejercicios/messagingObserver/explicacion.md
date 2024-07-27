# Problema

La empresa está desarrollando una aplicación de mensajería en tiempo real que permite a los usuarios comunicarse desde múltiples dispositivos. Cada vez que un usuario recibe un nuevo mensaje, todos los dispositivos del usuario deben ser notificados para que el
mensaje se muestre en cada uno de ellos. Para mantener la flexibilidad y desacoplar la lógica de notificación de la aplicación principal.

El patrón que escoja deberá permitir:

1. Notificación en Tiempo Real: Cada dispositivo del usuario debe recibir una
notificación cuando llegue un nuevo mensaje.
2. Desacoplamiento: La aplicación de mensajería debe poder notificar a cualquier
número de dispositivos sin saber detalles específicos sobre cada uno de ellos.
3. Flexibilidad: Los dispositivos pueden ser añadidos o eliminados en tiempo de
ejecución sin necesidad de modificar la lógica principal de la aplicación.

# Solución

## Patron seleccionado

Se decidio implementar el patron de comportamiento observador, ideal para escenarios en los que necesitas notificar a múltiples objetos cuando ocurre un cambio en el estado de un objeto. Es perfecto para el sistema de mensajería donde los dispositivos deben recibir notificaciones en tiempo real.

### Subject (Interfaz)

- Define los métodos que deben implementar los sujetos.
- Asociado a la clase User con una relación de implementación.

### User (Clase Concreta que Implementa Subject)

- Implementa Subject y gestiona una lista de observadores (Observer).
- Asociado a Observer con una relación de 1 a muchos (un User puede tener múltiples Observer).

Métodos:

* +addDevice(observer: Observer): void: Añade un observador a la lista.
* +removeDevice(observer: Observer): void: Elimina un observador de la lista.
* +notifyDevices(message: Message): void: Notifica a todos los observadores con el mensaje.


### Observer (Interfaz)

- Define el método que los observadores deben implementar para recibir notificaciones.
- Implementado por MobileDevice y DesktopDevice.

### MobileDevice y DesktopDevice (Clases Concretas que Implementan Observer)

- Implementan Observer para manejar notificaciones.
- Cada uno tiene un identificador (id) y maneja el mensaje a través del método notify.

### Message (Clase)

- Representa el mensaje que se envía a los observadores.
- Contiene información sobre el contenido del mensaje, el remitente y la marca de tiempo.

## Relaciones

### User y Observer:

- La relación es de uno a muchos (un User puede tener múltiples Observer).
- Se usa una asociación bidireccional: User tiene una lista de Observer y los Observer reciben notificaciones del User.

### Observer y User:

- Observer es una interfaz implementada por MobileDevice y DesktopDevice.

### User y Message:

- Uso: User crea un objeto Message y lo pasa a sus observadores. La clase User no tiene una asociación directa con Message, pero la usa en el método notifyDevices.
- Diagrama: No se dibuja una línea de asociación directa en el diagrama UML entre User y Message, pero Message se pasa como un parámetro en la operación notifyDevices.

### Observer y Message:

- Uso: Observer recibe un Message cuando el User llama a notifyDevices. Los métodos notify en MobileDevice y DesktopDevice procesan el Message.
- Diagrama: Al igual que con User, no hay una asociación directa en el diagrama, pero el Message es un parámetro en el método notify.

## Principios solid implementados

### Single Responsibility Principle (SRP) - Principio de Responsabilidad Única

**Clase User:** Su única responsabilidad es manejar la lista de dispositivos (Observer) y notificarles sobre los mensajes. No tiene otras responsabilidades aparte de gestionar observadores y emitir notificaciones.

**Clase MobileDevice y DesktopDevice:** Cada una se encarga únicamente de procesar y mostrar los mensajes que recibe. No tienen responsabilidades adicionales relacionadas con la gestión de usuarios o la creación de mensajes.

**Clase Message:** Su responsabilidad es encapsular la información del mensaje. Solo maneja datos relacionados con el mensaje y no tiene otras responsabilidades.

### Open/Closed Principle (OCP) - Principio de Abierto/Cerrado

**Interfaz Subject:** Está abierta a la extensión pero cerrada a la modificación. Puedes añadir nuevos tipos de Subject (como diferentes tipos de usuarios) sin cambiar la interfaz Subject.

**Interfaz Observer:** Está diseñada para ser extendida por diferentes tipos de observadores (MobileDevice, DesktopDevice). Puedes añadir nuevos tipos de observadores sin modificar la interfaz Observer.

**Clases MobileDevice y DesktopDevice:** Puedes añadir nuevos tipos de dispositivos observadores sin modificar la lógica de notificación en User.

###  Liskov Substitution Principle (LSP) - Principio de Sustitución de Liskov

**Clases MobileDevice y DesktopDevice:** Implementan la interfaz Observer, garantizando que cada tipo de observador puede ser utilizado en lugar de cualquier otra implementación de Observer sin alterar el comportamiento esperado del sistema. La sustitución de una clase observadora por otra sigue funcionando correctamente.

### Interface Segregation Principle (ISP) - Principio de Segregación de Interfaces

**Interfaz Observer:** Solo tiene un método notify(message: Message) que es relevante para los observadores. No impone métodos adicionales que los observadores no necesitarían.

**Interfaz Subject:** Proporciona métodos específicos para la gestión de observadores y notificaciones, evitando la inclusión de métodos que no sean necesarios para todos los sujetos.

### Dependency Inversion Principle (DIP) - Principio de Inversión de Dependencias

**Dependencia en Interfaces:** La clase User depende de la interfaz Observer en lugar de depender de implementaciones concretas de dispositivos. Esto permite que User trabaje con cualquier implementación de Observer sin estar acoplado a ninguna implementación concreta.

**Inyección de Dependencias:** Las instancias de MobileDevice y DesktopDevice se pasan a User a través de métodos (addDevice), permitiendo una mayor flexibilidad y modularidad.