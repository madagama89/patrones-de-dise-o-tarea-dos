package main.java.com.ejercicios.hero.tipoGuerrero;

import main.java.com.ejercicios.hero.habilidades.Ataque;
import main.java.com.ejercicios.hero.habilidades.Defensa;
import main.java.com.ejercicios.hero.habilidades.HabilidadMagica;

import java.util.ArrayList;
import java.util.List;

public class Mago extends Heroe {

    public Mago(Mago mago)
    {
        super(mago);
    }

    public Mago(String nombre, String traje, String cabello, String colorOjos, String tipoSombrero, String tipoCapa) {
        super(nombre,
                traje,
                cabello,
                colorOjos,
                tipoSombrero,
                tipoCapa,
                new ArrayList<>(List.of(new Ataque("Hechizo entorpecedor", 1, 1),
                        new Ataque("Hechizo de luz ", 2, 3))),
                new ArrayList<>(List.of(new Defensa("Escudo magico",1,1),
                        new Defensa("Defensa de luz",2,2))),
                new ArrayList<>(List.of(new HabilidadMagica("Invisibilidad",1,1),
                        new HabilidadMagica("Cambio de imagen",2,3))),
                new ArrayList<>(),
                new ArrayList<>(List.of("Basico"))
        );
    }

    @Override
    public Heroe clone() {
        return new Mago(this);
    }


    @Override
    public void atacar(int ataque) {
        System.out.println("\n"+ "Ataque de mago: "+ this.nombre);
        super.atacar(ataque);
    }

    @Override
    public void defender(int tipoDefensa) {
        System.out.println("\n"+ "Defensa de mago: "+ this.nombre);
        super.defender(tipoDefensa);
    }

    @Override
    public void usarHabilidadMagica(int tipoHabilidad) {
        System.out.println("\n"+ "Habilidad magica mago "+ this.nombre);
        super.usarHabilidadMagica(tipoHabilidad);
    }
}
