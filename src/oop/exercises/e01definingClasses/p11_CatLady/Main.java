package oop.exercises.e01definingClasses.p11_CatLady;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Map<String, Cat> cats = new HashMap<>();
        String firstLine = reader.readLine();

        while (!"End".equals(firstLine)){
            String[] tokens = firstLine.split("\\s+");
            Cat currentCat;
            switch (tokens[0]) {
                case "StreetExtraordinaire":
                    currentCat = new StreetExtraordinaire(tokens[1], tokens[2]);
                    break;
                case "Siamese":
                    currentCat = new Siamese(tokens[1], tokens[2]);
                    break;
                case "Cymric":
                    currentCat = new Cymric(tokens[1], tokens[2]);
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + tokens[0]);
            }
            cats.put(tokens[1], currentCat);

            firstLine = reader.readLine();
        }
        firstLine = reader.readLine();

        System.out.println(cats.get(firstLine).toString());
    }
}
