# Problema

**Contexto:**

Imagina un sistema de gestión de tareas en el que los usuarios pueden crear, editar, eliminar y completar tareas. Cada acción realizada por el usuario corresponde a una acción que debe ser ejecutada. Además, es importante mantener un registro de todas las acciones
realizadas para permitir la reversión de las mismas si es necesario.

Aplicación del Patrón:
En este escenario, el patrón será aplicado para encapsular cada una de las acciones que el
usuario puede realizar sobre una tarea.

El patrón que seleccione debe tener los siguientes beneficios:

- Desacopla el invocador de los objetos que realizan las acciones.
- Permite la extensión de nuevas operaciones sin modificar el código existente.
- Facilita el registro de acciones para realizar operaciones de reversión.

# Solución

## Patron seleccionado

Para este escenario, el patrón de diseño más adecuado es el Command Pattern. Este patrón es ideal para encapsular cada acción del usuario como un objeto, lo que permite desacoplar el invocador de los objetos que realizan las acciones, facilita la extensión de nuevas operaciones sin modificar el código existente y permite el registro de acciones para realizar operaciones de reversión.

- **Command Interface:** Define la estructura para ejecutar y deshacer comandos.
- **Concrete Commands:** Implementan acciones específicas (CreateTaskCommand, EditTaskCommand, CompleteTaskCommand).
- **Task:** Representa una tarea en el sistema.
- **TaskManager:** Gestiona las tareas (crear, editar, eliminar, completar).
- **CommandInvoker:** Ejecuta y deshace comandos, manteniendo un historial de comandos ejecutados.
- **Main:** Demuestra el uso de comandos y la capacidad de deshacer acciones.

Esta implementación permite desacoplar el invocador (en este caso, la clase `CommandInvoker`) de los objetos que realizan las acciones `TaskManager`, facilita la extensión de nuevas operaciones (añadiendo nuevos comandos concretos) y permite el registro de acciones para operaciones de reversión.

### Command (Interfaz)

La interfaz Command define los métodos execute() y undo(), que deben ser implementados por todos los comandos concretos.

### ConcreteCommand

Las clases que implementan la interfaz Command y definen las acciones específicas que se deben llevar a cabo. En el ejemplo proporcionado, las clases `CreateTaskCommand` y `CompleteTaskCommand` son comandos concretos.

### Receiver

La clase que realiza las acciones solicitadas por los comandos. En la implementación, `TaskManager` es el receptor porque realiza las operaciones sobre las tareas.

### Invoker

La clase que invoca los comandos. En el ejemplo, `CommandInvoker` es el invocador, ya que es responsable de ejecutar los comandos y manejar el historial de comandos para permitir deshacer (undo).

### Client

La clase que configura el entorno, crea los comandos y el invocador, y los conecta entre sí. En el ejemplo, el cliente es el código en el main que crea instancias de Task, TaskManager, Command, CommandInvoker, y los usa para ejecutar y deshacer comandos.

## Principios solid implementados

### Single Responsibility Principle (SRP) 

`Command:` Define la interfaz común para todos los comandos, estableciendo la responsabilidad de ejecutar y deshacer acciones.

`CreateTaskCommand y CompleteTaskCommand:` Cada comando específico se encarga solo de una acción concreta (crear o completar una tarea), sin mezclar responsabilidades.

`TaskManager:` Maneja exclusivamente la gestión de tareas, como agregar y eliminar tareas.

`CommandInvoker:` Maneja la ejecución de comandos y el historial para permitir deshacer, sin involucrarse en los detalles de las acciones específicas.

### Open/Closed Principle (OCP)

`Command:` La interfaz Command permite agregar nuevos comandos (como CreateTaskCommand, CompleteTaskCommand, etc.) sin modificar el código existente.

`CommandInvoker:` Puede manejar nuevos tipos de comandos sin necesidad de modificar su implementación, simplemente añadiendo más clases que implementen Command.

###  Liskov Substitution Principle (LSP) 

`CreateTaskCommand y CompleteTaskCommand:` Estas clases concretas pueden sustituir la interfaz Command sin romper la funcionalidad del sistema. El `CommandInvoker` puede ejecutar cualquier comando que implemente la interfaz `Command` sin necesidad de conocer detalles específicos.

### Interface Segregation Principle (ISP)

`Command:` La interfaz Command define solo los métodos necesarios (execute() y undo()) para cualquier comando. Los clientes que usan comandos solo necesitan conocer esta interfaz y no los detalles internos de la implementación específica del comando.

### Dependency Inversion Principle (DIP) 

`CommandInvoker:` Depende de la interfaz Command, no de implementaciones concretas de comandos. Esto permite que CommandInvoker ejecute cualquier comando que implemente la interfaz Command sin conocer los detalles específicos.

`CreateTaskCommand y CompleteTaskCommand:` Dependiendo de la interfaz Command y del TaskManager (que es el detalle bajo nivel), pero la interacción es a través de la interfaz.
