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

### Registro:

Los dispositivos se registran con el `User` usando el método `addDevice`. Cada dispositivo se convierte en un observador que estará interesado en recibir notificaciones.

### Envío de Mensaje:

Cuando se envía un mensaje, el `MessagingService` llama al método notifyDevices del User.

### Notificación:

El método `notifyDevices` del User itera sobre la lista de dispositivos y llama al método notify en cada dispositivo, entregando el mensaje.


### Recepción de Mensaje:

Cada dispositivo recibe la notificación a través de su método `notify` y maneja el mensaje de acuerdo con su implementación específica.
Esta implementación permite una comunicación eficiente y flexible entre el sujeto (`User`) y sus observadores (`Device`), cumpliendo con los principios del patrón Observer.

## Principios solid implementados

### Single Responsibility Principle (SRP) - Principio de Responsabilidad Única

Descripción:

Cada clase debe tener una única responsabilidad o razón para cambiar. En el contexto del patrón Observer, esto significa que cada clase tiene una responsabilidad claramente definida.

Aplicación en el Patrón Observer:

- User: Su responsabilidad es gestionar la lista de dispositivos y notificarles sobre los mensajes.
- Device: Su responsabilidad es recibir y procesar notificaciones de mensajes.
- Message: Su responsabilidad es representar el contenido del mensaje.

Cada clase maneja una responsabilidad específica, lo que facilita su mantenimiento y extensión.

### Open/Closed Principle (OCP) - Principio de Abierto/Cerrado

Descripción:

Las clases deben estar abiertas para extensión, pero cerradas para modificación. Esto significa que puedes añadir nuevas funcionalidades sin modificar el código existente.

Aplicación en el Patrón Observer:

- Añadir Nuevos Tipos de Dispositivos: Puedes introducir nuevos tipos de dispositivos que implementen la interfaz Device sin modificar la clase User o las clases existentes.
- Ampliación del Sistema de Notificación: Si decides añadir nuevas funcionalidades o tipos de notificaciones, puedes hacerlo extendiendo la interfaz Device o añadiendo nuevas implementaciones sin cambiar el código del User.

### Liskov Substitution Principle (LSP) - Principio de Sustitución de Liskov

Descripción:
Los objetos de una clase derivada deben poder reemplazar a los objetos de la clase base sin alterar la funcionalidad del programa.

Aplicación en el Patrón Observer:

- Implementación de Device: Todas las clases que implementan la interfaz Device (MobileDevice, DesktopDevice, etc.) pueden ser utilizadas de forma intercambiable en la clase User sin alterar el comportamiento del sistema.


## Interface Segregation Principle (ISP) - Principio de Segregación de Interfaces

Descripción:

Los clientes no deben estar forzados a depender de interfaces que no utilizan. Las interfaces deben ser específicas para el cliente.

Aplicación en el Patrón Observer:

- Interfaz Device: La interfaz Device tiene métodos específicos relacionados con la notificación (notify). Los dispositivos implementan solo los métodos que necesitan, evitando interfaces grandes y generales que obliguen a las clases a implementar métodos innecesarios.

## Dependency Inversion Principle (DIP) - Principio de Inversión de Dependencias

Descripción:

Los módulos de alto nivel no deben depender de los módulos de bajo nivel, sino de abstracciones. Las abstracciones no deben depender de detalles, sino que los detalles deben depender de las abstracciones.

Aplicación en el Patrón Observer:

- Dependencia de User en Device: La clase User depende de la interfaz Device, no de implementaciones concretas. Esto permite que User trabaje con cualquier tipo de dispositivo que implemente la interfaz Device, sin conocer los detalles de cómo se implementa cada dispositivo.