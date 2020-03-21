package oop.exercises.e01definingClasses.p08_PokemonTrainer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    private static Map<String, Trainer> trainerMap = new LinkedHashMap<>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        collectAllPokemons(reader);

        startTheTournament(reader);

        trainerMap.values().stream().collect(Collectors.toList())
                .stream().sorted((v1, v2) -> v2.getBadges().compareTo(v1.getBadges()))
                .forEach(System.out::println);

    }

    private static void startTheTournament(BufferedReader reader) throws IOException {
        String command = reader.readLine();
        while (!"End".equals(command)) {
            for (Trainer currentTrainer : trainerMap.values()) {
                try {
                    currentTrainer.checkForElement(command);
                } catch (ConcurrentModificationException cme) {
                }
            }
            command = reader.readLine();
        }
    }


    private static void collectAllPokemons(BufferedReader reader) throws IOException {
        String[] tokens = reader.readLine().split("\\s+");

        while (!"Tournament".equals(tokens[0])) {
            if (trainerMap.containsKey(tokens[0])) {
                trainerMap.get(tokens[0]).addPokemon(tokens[1], tokens[2], Integer.valueOf(tokens[3]));
            } else {
                trainerMap.put(tokens[0], new Trainer(tokens[0], tokens[1], tokens[2], Integer.valueOf(tokens[3])));
            }
            tokens = reader.readLine().split("\\s+");
        }

    }
}
