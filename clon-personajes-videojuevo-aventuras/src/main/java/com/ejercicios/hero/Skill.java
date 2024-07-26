package main.java.com.ejercicios.hero;

public class Skill {
    private String name;
    private int power;
    private String type; // "attack", "defense", "magic"

    public Skill(String name, int power, String type) {
        this.name = name;
        this.power = power;
        this.type = type;
    }

    public Skill copy() {
        return new Skill(this.name, this.power, this.type);
    }

    @Override
    public String toString() {
        return "Skill{name='" + name + "', power=" + power + ", type='" + type + "'}";
    }
}
