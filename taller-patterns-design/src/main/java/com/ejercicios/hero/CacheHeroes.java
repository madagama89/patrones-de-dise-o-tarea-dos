package main.java.com.ejercicios.hero;

import main.java.com.ejercicios.hero.tipoGuerrero.Arquero;
import main.java.com.ejercicios.hero.tipoGuerrero.Guerrero;
import main.java.com.ejercicios.hero.tipoGuerrero.Heroe;
import main.java.com.ejercicios.hero.tipoGuerrero.Mago;

import java.util.HashMap;
import java.util.Map;

public class CacheHeroes {
private Map<String, Heroe> cache = new HashMap<>();

public CacheHeroes() {
    Arquero Hawkeye = new Arquero("Hawkeye", "Chaleco", "Corto", "Verde", "Sin sombrero", "No tiene");
    Arquero RobinHood = new Arquero("RobinHood", "Camisa y pantalon", "Largo", "Cafes", "Triangular", "Larga");
    Arquero ArqueroSupremo = new Arquero("ArqueroSupremo", "Completo", "Largo", "Negro", "Alargado", "Larga");

    cache.put("Hawkeye", Hawkeye);
    cache.put("RobinHood", RobinHood);
    cache.put("ArqueroSupremo", ArqueroSupremo);

    Guerrero Thor = new Guerrero("Thor", "Armadura especial", "Largo", "Verde", "No tiene", "Larga");
    Guerrero Gunther = new Guerrero("Gunther", "Armadura sencilla", "Corto", "Cafes", "Armadura", "No tiene");
    Guerrero Hulk = new Guerrero("Hulk", "No tiene", "Corto", "Negro", "No tiene", "No tiene");

    cache.put("Thor", Thor);
    cache.put("Gunther", Gunther);
    cache.put("Hulk", Hulk);

    Mago Merlin = new Mago("Merlin", "Completo", "Largo", "Verde", "No tiene", "No tiene");
    Mago Albus = new Mago("Albus", "Especial", "Largo", "Negro", "Triangular", "Larga");
    Mago Gandalf = new Mago("Gandalf", "Dos piezas", "Largo", "Cafes", "Largo", "Corta");

    cache.put("Merlin", Merlin);
    cache.put("Albus", Albus);
    cache.put("Gandalf", Gandalf);
}

public Heroe get(String key) {
    return cache.get(key);
}

}
