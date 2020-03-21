package oop.exercises.e01definingClasses.p08_PokemonTrainer;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Trainer {
    private String name;
    private List<Pokemon> pokemons;
    private Integer badges;


    public Trainer(String name, String pokemonName, String element, Integer health) {
        this.badges = 0;
        this.pokemons = new ArrayList<>();

        this.name = name;
        this.pokemons.add(new Pokemon(pokemonName, element, health));
    }
    public void addPokemon(String pokemonName, String element, Integer health){
        this.pokemons.add(new Pokemon(pokemonName, element, health));
    }

    public void checkForElement(String element){
        boolean hasElement = false;
        for (Pokemon pokemon : pokemons) {
            if (pokemon.getElement().equals(element)) {
                hasElement = true;
                break;
            }
        }

        if (hasElement){
            this.badges++;
        } else {
            for (Pokemon pokemon : pokemons) {
                if (pokemon.getHealth()>10){
                    pokemon.decreaseHealthWith10();
                } else {
                    this.pokemons.remove(pokemon);

                }
            }
        }
    }

    public String getName() {
        return this.name;
    }

    public Collection<Pokemon> getPokemons() {
        return Collections.unmodifiableCollection(this.pokemons);
    }

    public Integer getBadges() {
        return this.badges;
    }

    @Override
    public String toString() {
        return String.format("%s %d %d", this.name, this.badges, this.pokemons.size());
    }
}
