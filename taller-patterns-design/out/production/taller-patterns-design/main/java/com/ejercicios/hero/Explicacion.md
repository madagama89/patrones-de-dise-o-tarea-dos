
### Ejercicio 1:
El patron escogido (prototype) nos permite retornar instancias de si mismas. Resolviendo la 
necesidad de crear instancias identicas. 

Se crea una clase por cada habilidad (Ataque, Defensa, Habilidad magica), permitiendo crear nuevas habilidades sin necesidad de crear
fuciones dedicadas a cada habilidad,  permitiendo asi estar cerrado a modificacion y abierto a extensión.

- La clase `abstract Heroe` se encarga de definir todas las propiedas y funciones base de los heroes, permitiendo la extension 
a las clases `Arquero`, `Guerrero`, `Mago`. Cada uno puede agregar sus propias propiedades y funciones especificas, ademas 
de sobreescribir las funciones heredadas.

- La clase `CacheHeroes` se encarga de instanciar los heroes por defecto.