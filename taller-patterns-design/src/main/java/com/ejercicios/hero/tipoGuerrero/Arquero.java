package main.java.com.ejercicios.hero.tipoGuerrero;

import main.java.com.ejercicios.hero.habilidades.Ataque;
import main.java.com.ejercicios.hero.habilidades.Defensa;
import main.java.com.ejercicios.hero.habilidades.HabilidadMagica;

import java.util.ArrayList;
import java.util.List;

public class Arquero extends Heroe {

    public Arquero(Arquero arquero)
    {
        super(arquero);
    }

    public Arquero(String nombre, String traje, String cabello, String colorOjos, String tipoSombrero, String tipoCapa) {
        super(nombre,
                traje,
                cabello,
                colorOjos,
                tipoSombrero,
                tipoCapa,
                new ArrayList<>(List.of(new Ataque("Flecha de acero",1,1),
                        new Ataque("Flecha de fuego ",2,2))),
                new ArrayList<>(List.of(new Defensa("Bloqueo con arco",1,1),
                        new Defensa("Disparo de multiples flechas",2,3))),
                new ArrayList<>(List.of(new HabilidadMagica("Modificar tamaño",1,1),
                        new HabilidadMagica("Generar nuevas flechas",2,3))),
                new ArrayList<>(),
                new ArrayList<>(List.of("Basico"))
        );
    }

    @Override
    public Heroe clone() {
        return new Arquero(this) ;
    }

    @Override
    public void atacar(int ataque) {
        System.out.println("\n"+ "Ataque de arquero: "+ this.nombre);
        super.atacar(ataque);
    }

    @Override
    public void defender(int tipoDefensa) {
        System.out.println("\n"+ "Defensa de guerrero: "+ this.nombre);
        super.defender(tipoDefensa);
    }

    @Override
    public void usarHabilidadMagica(int tipoHabilidad) {
        System.out.println("\n"+ "Habilidad magica guerrero "+ this.nombre);
        super.usarHabilidadMagica(tipoHabilidad);
    }
}