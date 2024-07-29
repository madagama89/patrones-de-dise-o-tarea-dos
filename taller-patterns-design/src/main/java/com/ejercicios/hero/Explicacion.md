
### Ejercicio 1:
El patron escogido (prototype) nos permite retornar instancias de si mismas. Resolviendo la 
necesidad de crear instancias identicas. 

Se crea una clase por cada habilidad (Ataque, Defensa, Habilidad magica), permitiendo crear nuevas habilidades sin necesidad de crear
fuciones dedicadas a cada habilidad,  permitiendo asi estar cerrado a modificacion y abierto a extensión.


- La clase `abstract Heroe` se encarga de definir todas las propiedas y funciones base de los heroes, permitiendo la extension
  a las clases `Arquero`, `Guerrero`, `Mago`. Cada uno puede agregar sus propias propiedades y funciones especificas, ademas
  de sobreescribir las funciones heredadas.

- Las clases `Arquero`, `Guerrero`, `Heroe` son utilizadas para crear obejtos independientes. Permitiendo agregar
- caracteristicas y funcionalidades independientes por cada tipo de Guerero.

- La clase `CacheHeroes` se encarga de instanciar los heroes por defecto para ser utilizados en la
- clase `main`. 


### Que logramos 
- Clonar objetos sin que estos esten acoplados a clases concretas
- Con la clase cacheHereos evitamos repetir el codigo de la inicialización de hereos.
- Podemos crear objetos complejos con mayor facilidad.