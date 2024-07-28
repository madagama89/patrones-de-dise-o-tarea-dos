package main.java.com.ejercicios;

import main.java.com.ejercicios.hero.*;
import main.java.com.ejercicios.hero.tipoGuerrero.Heroe;

import java.util.ArrayList;
import java.util.List;

public class mainHero {
static Heroe Hawkeye;
static Heroe RobinHood;
static Heroe ArqueroSupermo;
static Heroe Thor;
static Heroe Gunther;
static Heroe Hulk;
static Heroe Merlin;
static Heroe Albus;
static Heroe Gandalf;

public static void main(String[] args) {
    //Heroes por defecto
    inicarHeroes();
    verCualidadesHeroes();
    verHabilidadesHeroes();

    //Clonar heroe antes de estar en combates y ganar experiencia
    Heroe merlinMejorado = Merlin.clone();

    //Personalizando heroe despues de ser clonado
    merlinMejorado.nombre = "Merlin ultra";
    merlinMejorado.colorOjos = "Blanco";
    merlinMejorado.traje = "Traje magico";

    merlinMejorado.verCualidades();
    merlinMejorado.verHabilidadesDeCombate();

    //Ejemplo combate
    System.out.println("--COMBATE---");

    Merlin.atacar(2);
    Thor.defender(1);
    Merlin.usarHabilidadMagica(1);
    RobinHood.atacar(2);
    Thor.usarHabilidadMagica(1);
    RobinHood.atacar(1);
    Thor.defender(2);
    merlinMejorado.atacar(1);
    merlinMejorado.atacar(2);

    //Clonando heroe despues de combate
    System.out.println("Clonando a Thor = Thor supremo");

    Heroe thorSupremo = Thor.clone();
    thorSupremo.nombre = "Thor supremo";
    thorSupremo.verCualidades();
    thorSupremo.verHistorialExperiencia();
    thorSupremo.verHistorialNivel();

    thorSupremo.atacar(1);

    //Clonando un clon
    System.out.println("Clonando a clone Thor supremo");
    Heroe ultraThor = thorSupremo.clone();
    ultraThor.colorOjos = "Rojos";
    ultraThor.verCualidades();
    ultraThor.verHistorialExperiencia();

    //Ver registro de experiencia y nivel de RoobinHood
    RobinHood.verHistorialExperiencia();
    RobinHood.verHistorialNivel();
}

public static void inicarHeroes() {
    CacheHeroes cache = new CacheHeroes();
    Hawkeye = cache.get("Hawkeye");
    RobinHood =  cache.get("RobinHood");
    ArqueroSupermo = cache.get("ArqueroSupremo");
    Thor = cache.get("Thor");
    Gunther = cache.get("Gunther");
    Hulk =  cache.get("Hulk");
    Merlin = cache.get("Merlin");
    Albus =  cache.get("Albus");
    Gandalf =  cache.get("Gandalf");
}

public static void verHabilidadesHeroes() {
    Hawkeye.verHabilidadesDeCombate();
    Thor.verHabilidadesDeCombate();
    Gandalf.verHabilidadesDeCombate();
}

public static void verCualidadesHeroes() {
    Hawkeye.verCualidades();
    Thor.verCualidades();
    Gandalf.verCualidades();
}
}