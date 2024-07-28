import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class OrdenComida extends Orden {
    private List<Producto> catalogo;

    OrdenComida() {
        catalogo = new ArrayList<>();
        catalogo.add(new Producto("Carnes", 1.5, 100));
        catalogo.add(new Producto("Pollo Asado", 1.4, 80));
        catalogo.add(new Producto("Pasta", 1.0, 150));
        catalogo.add(new Producto("Cazuela Frijoles", 2.0, 50));
    }

    public boolean tomarPedido() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nComidas disponibles:");
        for (Producto p : catalogo) {
            System.out.println(p.getNombre() + " - Precio: $" + p.getPrecio());
        }

        System.out.print("Ingrese el nombre de la comida: ");
        this.nombreProducto = scanner.nextLine().trim();

        System.out.print("Ingrese la cantidad deseada: ");
        this.cantidad = scanner.nextInt();
        scanner.nextLine();
        this.getCatalog();

        return true;
    }

    protected void getCatalog() {
        this.catalogoMain = this.catalogo;
    }

    protected void prepararPedido() {
        System.out.println("Preparando comida");
    }
}
