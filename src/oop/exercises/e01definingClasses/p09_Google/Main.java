package oop.exercises.e01definingClasses.p09_Google;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {

    private static Map<String, Person> persons;

    public static void main(String[] args) throws IOException {

        persons = new HashMap<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String command = reader.readLine();
        while (!"End".equals(command)) {
            String[] tokens = command.split("\\s+");
            persons.putIfAbsent(tokens[0], new Person(tokens[0]));

            switch (tokens[1]) {
                case "company":
                    persons.get(tokens[0]).setCompany(tokens[2], tokens[3], tokens[4]);
                    break;
                case "pokemon":
                    persons.get(tokens[0]).addPokemon(tokens[2], tokens[3]);
                    break;
                case "parents":
                    persons.get(tokens[0]).addParent(tokens[2], tokens[3]);
                    break;
                case "children":
                    persons.get(tokens[0]).addChild(tokens[2], tokens[3]);
                    break;
                case "car":
                    persons.get(tokens[0]).setCar(tokens[2], tokens[3]);
                    break;
                default:
                    System.out.println("we have some mistake - unknown command");
                    break;
            }
            command = reader.readLine();
        }
        System.out.println(persons.get(reader.readLine()).toString());
    }

}

