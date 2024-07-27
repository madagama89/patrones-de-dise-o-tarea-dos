## Integrantes de equipo

- Marlon David Garcia Marin
- Sergio Josue Rodriguez Taborda
- Claudia Alexandra Bojaca Torres


## Patrón seleccionado

- Ejercicio 1: Patron Prototype
- Ejercicio 2: Patron Observer
- Ejercicio 3: Patron Template Method
- Ejercicio 4: Patron Command
- Ejercicio 5:

## Estructura del proyecto
#### Carpetas
- `main.java.com.ejercicios`: Paquete principal
- `hero`: Clases relacionadas con el ejercicio 1
- `messagingObserver`: Clases relacionadas con el ejercicio 2
- `sistemaGestionTareas`: Clases relacionadas con el ejercicio 3

#### Archivos principales
- `mainHero`: Clase para ejecutar el ejercicio 1
- `mainMessagingObserver`: Clase para ejecutar el ejercicio 2
- `mainSistemaGestionTreas`: Clase para ejecutar el ejercicio 3

### Ejercicio 1:
El patron escogido (prototype) nos permite retornar instancias de si mismas. Resolviendo la 
necesidad de crear instancias identicas. 

Se crea una clase por cada habilidad (Ataque, Defensa, Habilidad magica), permitiendo crear nuevas habilidades sin necesidad de crear
fuciones dedicadas a cada habilidad,  permitiendo asi estar cerrado a modificacion y abierto a extensión.

- La clase `abstract Heroe` se encarga de definir todas las propiedas y funciones base de los heroes, permitiendo la extension 
a las clases `Arquero`, `Guerrero`, `Mago`. Cada uno puede agregar sus propias propiedades y funciones especificas, ademas 
de sobreescribir las funciones heredadas.

- La clase `CacheHeroes` se encarga de instanciar los heroes por defecto.