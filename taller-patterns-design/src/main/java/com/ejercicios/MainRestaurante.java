package main.java.com.ejercicios;

import java.util.Scanner;

import main.java.com.ejercicios.gestionRestaurantes.Orden;
import main.java.com.ejercicios.gestionRestaurantes.OrdenBebidas;
import main.java.com.ejercicios.gestionRestaurantes.OrdenComida;
import main.java.com.ejercicios.gestionRestaurantes.OrdenPostre;

public class MainRestaurante {

    public static void main(String[] args) {
        String itemSeleccionado;
        Orden orden = null;
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nMenú disponible:");
        System.out.println("\nSeleccione: 1 - Comida, 2 - Bebida, 3 Postre.");
        itemSeleccionado = scanner.nextLine().trim();

        if (itemSeleccionado.equals("1")) {
            orden = new OrdenComida();
        } else if (itemSeleccionado.equals("2")) {
            orden = new OrdenBebidas();
        } else {
            orden = new OrdenPostre();
        }


        if (orden.ordenTemplate()) {
            System.out.println("Orden procesada con éxito");
        }
    }
}