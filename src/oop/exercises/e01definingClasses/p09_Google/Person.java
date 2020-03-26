package oop.exercises.e01definingClasses.p09_Google;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private Company company;
    private Car car;
    List<Parent> parents;
    List<Child> children;
    List<Pokemon> pokemons;

    public Person(String name) {
        this.name = name;
    }

    public void setCompany(String name, String department, String salary) {
        this.company = new Company(name, department, salary);
    }

    public void setCar(String name, String speed) {
        this.car = new Car(name, speed);
    }

    public void addPokemon(String name, String type) {
        if (this.pokemons == null) {
            this.pokemons = new ArrayList<>();
        }
        this.pokemons.add(new Pokemon(name, type));
    }

    public void addParent(String name, String bDay) {
        if (this.parents == null) {
            this.parents = new ArrayList<>();
        }
        this.parents.add(new Parent(name, bDay));
    }

    public void addChild(String name, String bDay) {
        if (this.children == null) {
            this.children = new ArrayList<>();
        }
        this.children.add(new Child(name, bDay));
    }

    @Override
    public String toString() {
        StringBuilder output = new StringBuilder();
        output.append(name).append(System.lineSeparator());
        output.append("Company:").append(System.lineSeparator());
        if (company != null) {
            output.append(company.toString()).append(System.lineSeparator());
        }
        output.append("Car:").append(System.lineSeparator());
        if (car != null) {
            output.append(car.toString()).append(System.lineSeparator());
        }

        output.append("Pokemon:").append(System.lineSeparator());
        if (pokemons != null) {
            for (Pokemon pokemon : pokemons) {
                output.append(pokemon.toString()).append(System.lineSeparator());
            }
        }
        output.append("Parents:").append(System.lineSeparator());
        if (parents != null) {
            for (Parent p : parents) {
                output.append(p.toString()).append(System.lineSeparator());
            }
        }
        output.append("Children:").append(System.lineSeparator());
        if (children != null) {
            for (Child c : children) {
                output.append(c.toString()).append(System.lineSeparator());
            }
        }
        return output.toString().trim();

    }


}
