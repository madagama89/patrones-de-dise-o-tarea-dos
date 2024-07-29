package main.java.com.ejercicios.gestionRestaurantes;

import java.util.List;

public abstract class Orden {
    protected String nombreProducto;
    protected double precio;
    protected int cantidad;
    protected int stock;
    protected List<Producto> catalogoMain;


    public final boolean ordenTemplate() {
        if(tomarPedido()) {
            if(verificarDisponibilidad()) {
                calcularPrecio();
                prepararPedido();
                continuarPedido();
            }
        }
        return false;
    }

    protected boolean verificarDisponibilidad() {
        this.stock = obtenerStockPorNombre(this.catalogoMain, nombreProducto);
        if (this.cantidad > this.stock) {
            System.out.println("El producto no está disponible");
            return false;
        }
        System.out.println("El producto está disponible");
        return true;
    }

    protected void calcularPrecio() {
        double precio = this.obtenerPrecioPorNombre(this.catalogoMain, nombreProducto);
        System.out.println("El precio total es: " + precio * this.cantidad);
    }

    protected void continuarPedido() {
        System.out.println("El pedido ha sido enviado");
    }

    protected abstract boolean tomarPedido();
    protected abstract void prepararPedido();

    private double obtenerPrecioPorNombre(List<Producto> catalogo, String nombre) {
        for (Producto producto : catalogo) {
            if (producto.getNombre().equals(nombre)) {
                return producto.getPrecio();
            }
        }
        return -1; // No fue encontrado
    }

    private int obtenerStockPorNombre(List<Producto> catalogo, String nombre) {
        for (Producto producto : catalogo) {
            if (producto.getNombre().equals(nombre)) {
                return producto.getStock();
            }
        }
        return -1; // No fue encontrado
    }

    protected abstract void getCatalog();

}

