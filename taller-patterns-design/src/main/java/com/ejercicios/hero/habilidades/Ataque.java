package main.java.com.ejercicios.hero.habilidades;

public class Ataque {

    private String nombre;
    private int id;
    private int puntos;

    public Ataque(String nombre, int id, int puntos) {
        this.nombre = nombre;
        this.id = id;
        this.puntos = puntos;
    }

    public String getNombre() {
            return nombre;
        }
    public int getTipo() {
            return id;
        }
    public int getPuntos() {
            return puntos;
        }
}

