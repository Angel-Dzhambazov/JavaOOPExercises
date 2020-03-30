package oop.exercises.e02encapsulation.p04_ShoppingSpree;

import javax.sound.midi.Soundbank;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        Map<String, Person> persons = new LinkedHashMap<>();
        Map<String, Product> products = new LinkedHashMap<>();
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            //fill people;
            String[] people = reader.readLine().split(";");
            for (String person : people) {
                String[] tokens = person.split("=");
                String name = tokens[0].trim();
                if (name.length()==0){
                    throw new NullPointerException("Name cannot be empty");
                }
                persons.put(name, new Person(name, Integer.parseInt(tokens[1].trim())));
            }

            //fill products
            String[] inputProducts = reader.readLine().split(";");
            for (String currentProduct : inputProducts) {
                String[] tokens = currentProduct.split("=");
                String name = tokens[0].trim();
                if (name.length()==0){
                    throw new NullPointerException("Name cannot be empty");
                }
                products.put(name, new Product(name, Integer.parseInt(tokens[1].trim())));
            }

            String command = reader.readLine();
            while (!"END".equals(command)) {
                String[] tokens = command.split("\\s+");
                persons.get(tokens[0].trim()).buyProduct(products.get(tokens[1].trim()));

                command = reader.readLine();
            }

            for (Person currentPerson : persons.values()) {
                System.out.println(currentPerson.toString());
            }


        } catch (IllegalArgumentException iae) {
            System.out.println(iae.getMessage());
        } catch (NullPointerException npe){
            System.out.println(npe.getMessage());
        }
    }
}
