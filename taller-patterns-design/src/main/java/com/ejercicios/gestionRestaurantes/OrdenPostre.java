package main.java.com.ejercicios.gestionRestaurantes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OrdenPostre extends Orden {
    private List<Producto> catalogo;

    public OrdenPostre() {
        catalogo = new ArrayList<>();
        catalogo.add(new Producto("Postre de fresa", 1.5, 10));
        catalogo.add(new Producto("Helado", 1.4, 20));
        catalogo.add(new Producto("Postre de limón", 1.0, 15));
        catalogo.add(new Producto("Tiramisú", 2.0, 50));
    }

    protected boolean tomarPedido() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nPostres disponibles:");
        for (Producto p : catalogo) {
            System.out.println(p.getNombre() + " - Precio: $" + p.getPrecio());
        }

        System.out.print("Ingrese el nombre del postre: ");
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
        System.out.println("Preparando postre");
    }
}
