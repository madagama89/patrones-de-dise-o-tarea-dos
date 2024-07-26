package main.java.com.ejercicios.hero;

import java.util.ArrayList;
import java.util.List;

public class Hero implements Cloneable {
    private String name;
    private String appearance;
    private HeroClass heroClass;
    private List<Skill> skills;
    private int experience;
    private int level;
    private int skillPoints;

    public Hero(String name, String appearance, HeroClass heroClass, List<Skill> skills, int experience, int level, int skillPoints) {
        this.name = name;
        this.appearance = appearance;
        this.heroClass = heroClass;
        this.skills = new ArrayList<>(skills);
        this.experience = experience;
        this.level = level;
        this.skillPoints = skillPoints;
    }

    @Override
    protected Hero clone() {
        List<Skill> clonedSkills = new ArrayList<>();
        for (Skill skill : this.skills) {
            clonedSkills.add(skill.copy());
        }
        return new Hero(this.name, this.appearance, this.heroClass, clonedSkills, this.experience, this.level, this.skillPoints);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAppearance(String appearance) {
        this.appearance = appearance;
    }

    @Override
    public String toString() {
        return "Hero{name='" + name + "', appearance='" + appearance + "', heroClass=" + heroClass +
                ", skills=" + skills + ", experience=" + experience + ", level=" + level + ", skillPoints=" + skillPoints + "}";
    }
}
