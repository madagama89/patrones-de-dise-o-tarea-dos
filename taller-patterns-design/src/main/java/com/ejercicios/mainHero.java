package main.java.com.ejercicios;

import main.java.com.ejercicios.hero.*;

import java.util.ArrayList;
import java.util.List;

public class mainHero {
    public static void main(String[] args) {
        // Crear habilidades para los héroes
        List<Skill> skills = new ArrayList<>();
        skills.add(new Skill("Slash", 50, "attack"));
        skills.add(new Skill("Shield Block", 30, "defense"));

        // Crear un héroe original
        Hero originalHero = new Hero("Arthas", "Knight", HeroClass.WARRIOR, skills, 1000, 10, 5);

        // Clonar el héroe
        HeroCloner heroCloner = new HeroCloner();
        Hero clonedHero = heroCloner.cloneHero(originalHero, "Uther", "Paladin");

        // Mostrar información de los héroes
        System.out.println("Original Hero: " + originalHero);
        System.out.println("Cloned Hero: " + clonedHero);
    }
}
