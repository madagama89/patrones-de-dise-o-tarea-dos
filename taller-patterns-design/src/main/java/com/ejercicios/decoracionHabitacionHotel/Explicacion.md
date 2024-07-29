
### Ejercicio 5:
El patron escogido (Decorator) nos permite agregar comportamientos de forma dinamica
a objetos existentes utiizando envoltorios

- La clase `EnvoltorioDecoracionEstetica` y `EnvoltorioDecoracionEstructural` se encargan de extender el comportamiento de la 
- super clase, estas pueden agregar nuevas funcionaldiades.

- Las clases `IDecoradorHabitaciones` declara la interfaz común para envoltorios y los objetos envueltos.

- La clase `HabitacionesDecoradorBase`  delega todas las operaciones a los objetos envueltos.

- La clase `Habitaciones` define el comportamiento básico, que los envoltorios pueden extender.


### Que logramos
- Extender el comportamiento del objeto sin crear una nueva subclase.
- Añadir o eliminar responsabilidades de un objeto durante el tiempo de ejecución.
- Combinar varios comportamientos envolviendo el objeto en varios decoradores.
- Cumplir con el principio de responsabilida unica.