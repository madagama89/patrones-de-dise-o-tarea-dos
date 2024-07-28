package main.java.com.ejercicios.hero.tipoGuerrero;

import main.java.com.ejercicios.hero.habilidades.Ataque;
import main.java.com.ejercicios.hero.habilidades.Defensa;
import main.java.com.ejercicios.hero.habilidades.HabilidadMagica;

import java.util.ArrayList;
import java.util.List;

public class Guerrero extends Heroe {

    public Guerrero(Guerrero arquero)
    {
        super(arquero);
    }

    public Guerrero(String nombre, String traje, String cabello, String colorOjos, String tipoSombrero, String tipoCapa) {
        super(nombre,
                traje,
                cabello,
                colorOjos,
                tipoSombrero,
                tipoCapa,
                new ArrayList<>(List.of(new Ataque("Lanzamineto de arma",1,1),
                        new Ataque("Golpe con arma",2,3))),
                new ArrayList<>(List.of(new Defensa("Escudo",1,1),
                        new Defensa("Movimiento de resguardo",2,3))),
                new ArrayList<>(List.of(new HabilidadMagica("Fuerza suprema",1,1),
                        new HabilidadMagica("Velocidad superior",2,3))),
                new ArrayList<>(),
                new ArrayList<>(List.of("Basico"))
        );
    }

    @Override
    public Heroe clone() {
        return new Guerrero(this) ;
    }

    @Override
    public void atacar(int ataque) {
        super.atacar(ataque);
        System.out.println("\n"+ "Ataque de guerrero: "+ this.nombre);
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
