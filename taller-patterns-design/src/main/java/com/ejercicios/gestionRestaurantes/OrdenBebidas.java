package main.java.com.ejercicios.gestionRestaurantes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OrdenBebidas extends Orden {
    private List<Producto> catalogo;

    public OrdenBebidas() {
        catalogo = new ArrayList<>();
        catalogo.add(new Producto("Coca Cola", 1.5, 100));
        catalogo.add(new Producto("Pepsi", 1.4, 80));
        catalogo.add(new Producto("Agua", 1.0, 150));
        catalogo.add(new Producto("Jugo de Naranja", 2.0, 5));
    }

    public boolean tomarPedido() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nBebidas disponibles:");
        for (Producto p : catalogo) {
            System.out.println(p.getNombre() + " - Precio: $" + p.getPrecio());
        }

        System.out.print("Ingrese el nombre de la bebida: ");
        this.nombreProducto = scanner.nextLine().trim();

        System.out.print("Ingrese la cantidad deseada: ");
        this.cantidad = Integer.valueOf(scanner.nextLine().trim());
        this.getCatalog();

        return true;
    }

    protected void getCatalog() {
        this.catalogoMain = this.catalogo;
    }

    protected void continuarPedido() {
        System.out.println("Sobreescribiendo el mensaje de continuando con la bebida");
    }

    protected void prepararPedido() {
        System.out.println("Preparando bebida");
    }
}
