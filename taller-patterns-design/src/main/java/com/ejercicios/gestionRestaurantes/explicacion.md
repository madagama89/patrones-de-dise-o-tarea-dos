# Desarrollo de un Sistema de Gestión de Restaurantes
## Problema:
En un proyecto de desarrollo de software para un sistema de gestión de restaurantes, debe
buscar el patrón de diseño para ser aplicado para manejar la lógica común de
procesamiento de órdenes de alimentos y bebidas.
### Contexto:
Imagina que estamos desarrollando un sistema de gestión de restaurantes que permite a
los usuarios realizar pedidos en línea. Este sistema debe manejar una variedad de órdenes,
que pueden incluir comida, bebidas y postres. Cada tipo de pedido tiene un proceso común,
como la toma de pedido, la preparación, la verificación de disponibilidad, el cálculo de
precios, etc.
### Aplicación del Patrón:
En este escenario, el patrón se aplicaría para definir una estructura común para el
procesamiento de órdenes, mientras se permite a las subclases (por ejemplo, clase
OrderFood, OrderBeverage, OrderDessert) implementar pasos específicos según el tipo de
pedido.
El patrón que seleccione debe tener los siguientes beneficios:
- Encapsulación de la estructura del algoritmo común en una clase base.
- Flexibilidad para que las subclases implementen pasos específicos según el tipo de
pedido.
. Evita la duplicación de código al reutilizar la estructura común.

## Solución:

Para este ejercicio se optó por el patrón **Template method** porque se refiere al comportamiento del sistema cuando se procesan los diferentes tipos de pedidos (comida, bebidas, postres).  También se seleccionó porque se requiere definir el algoritmo de procesamiento de pedidos.

Como lo indica en la teoría, el patrón Template Method sugiere dividir un algoritmo en una serie de pasos (métodos) y se coloca estos llamados en un único método plantilla.  Los pasos pueden ser abstractos o pueden tener una implementación opor defecto. 

Los pasos abstractos deben ser implementados por todas las subclases, los pasos opcionales pueden tener una implementación por defecto, pero aún así se pueden sobreescribir si es necesario.

Es importante de la teoría señalar lo siguiente:

* La Clase Abstracta declara métodos que actúan como pasos de un algoritmo, así como el propio método plantilla que invoca estos métodos en un orden específico. Los pasos pueden declararse abstractos o contar con una implementación por defecto.

* Las Clases Concretas pueden sobrescribir todos los pasos, pero no el propio método plantilla.


## Implementación:

En el ejercicio vamos a tener:

### Clase abstracta

* **Orden**: Clase abstracta que contiene el método plantilla que define el orden de los pasos para realizar un pedido en un orden, y a su vez contiene los métodos abstractos y los que no lo son:

- **ordenTemplate()**:  Este método tiene la invocación de los pasos del pedido en un orden específico.

El método plantilla ordenTemplate() tiene los siguientes pasos:
- tomarPedido()
- verificarDisponibilidad()
- calcularPrecio();
- prepararPedido();
- continuarPedido();

#### Métodos abstractos
Deben implementarlos todas las subclases o clases concretas.  
- **tomarPedido()**:  Método abstracto que muestra los productos para cada categoría y recibe el pedido particular de acuerdo a la categoría, si es bebida, comida o postre.
- **prepararPedido()**: Este método también se consideró que puede ser muy particular, porque la preparación del pedido está en función del tipo de pedido.

#### Otros métodos:
Estos métodos también forman parte de los métodos indicados en el método plantilla, pero estos pasos se consideran comunes a cualquier pedido y también pueden ser modificados en las clases concretas.

- **VerificarDisponibilidad**: Revisa si la cantidad requerida en el pedido es suficiente de acuerdo al stock de cada producto.
- **calcularPrecio()**: Calcula el precio del pedido.
- **continuarPedido()**:  Entrega un mensaje donde indica que el pedido ha sido enviado.

### Clases concretas:

Estas clases extienden la clase Orden y deben implementar los métodos abstractos.
- **OrdenBebidas**: Es la subclase que procesa los pedidos de bebidas.  Esta clase sobreescribe el método de continuarPedido().
- **OrdenComida**: Es la subclase que procesa los pedidos de comidas.
- **OrdenPostres**: Es la subclase que procesa los pedidos de postres.

### Ventajas de utilizar el patrón Method Template:

- Evita la duplicación del código al manejar en la clase Orden todos los métodos que son comunes a todas las tipos de pedidos.
- Encapsula el algoritmo en la clase base, permitiendo que las clases concretas hereden esta estructura y modifiquen los pasos necesarios.
- Este método permite que los pedidos sigan una serie de pasos, pero a su vez cada subclase pueda modificarlos.
- Permite agregar otro tipo de pedidos.










