package oop.exercises.e01definingClasses.p08_PokemonTrainer;

public class Pokemon {
    private String name;
    private String element;
    private Integer health;

    public Pokemon(String name, String element, Integer health) {
        this.name = name;
        this.element = element;
        this.health = health;
    }

    public String getName() {
        return this.name;
    }

    public void decreaseHealthWith10() {
        this.health -= 10;
    }

    public String getElement() {
        return this.element;
    }

    public Integer getHealth() {
        return this.health;
    }

    @Override
    public String toString() {
        return "Pokemon{" +
                "name='" + name + '\'' +
                ", element='" + element + '\'' +
                ", health=" + health +
                '}';
    }
}
