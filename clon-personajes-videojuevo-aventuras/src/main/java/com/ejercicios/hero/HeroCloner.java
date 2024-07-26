package main.java.com.ejercicios.hero;


public class HeroCloner {
    public Hero cloneHero(Hero hero, String newName, String newAppearance) {
        Hero clonedHero = hero.clone();
        clonedHero.setName(newName);
        clonedHero.setAppearance(newAppearance);
        return clonedHero;
    }
}
