package oop.exercises.e01definingClasses.p07_CarSalesman;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Main {
    private static List<Car> ourCars = new LinkedList<>();
    private static Map<String, Engine> ourEngines = new HashMap<>();

    public static void main(String[] args) throws IOException {

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(isr);
        int n = Integer.parseInt(reader.readLine());
        Engine currentEngine = null;
        String[] tokens = null;
        collectAllEngines(reader, n, currentEngine);
        currentEngine = null; //clean for garbage collector ;)

        n = Integer.parseInt(reader.readLine());
        Car currentCar = null;
        collectAllCars(reader, n, currentCar);
        currentCar = null; //clean for garbage collector ;)

        ourCars.stream().forEach(System.out::println);

    }

    private static void collectAllCars(BufferedReader reader, int n, Car currentCar) throws IOException {
        String[] tokens;
        for (int i = 0; i < n; i++) {
            tokens = reader.readLine().split("\\s+");
            switch (tokens.length) {
                case 2:
                    currentCar = new Car(tokens[0], ourEngines.get(tokens[1]));
                    break;
                case 3:
                    try {
                        currentCar = new Car(tokens[0], ourEngines.get(tokens[1]), Integer.parseInt(tokens[2]));
                    } catch (NumberFormatException nfe) {
                        currentCar = new Car(tokens[0], ourEngines.get(tokens[1]), tokens[2]);
                    }
                    break;
                case 4:
                    currentCar = new Car(tokens[0], ourEngines.get(tokens[1]), Integer.parseInt(tokens[2]), tokens[3]);
                    break;
                default:
                    System.out.println("ERROR There is some input Error!");
                    break;
            }
            ourCars.add(currentCar);
        }
    }

    private static void collectAllEngines(BufferedReader reader, int n, Engine currentEngine) throws IOException {
        String[] tokens;
        for (int i = 0; i < n; i++) {
            tokens = reader.readLine().split("\\s+");
            switch (tokens.length) {
                case 2:
                    currentEngine = new Engine(tokens[0], Integer.parseInt(tokens[1]));
                    break;
                case 3:
                    try {
                        currentEngine = new Engine(tokens[0], Integer.parseInt(tokens[1]), Integer.parseInt(tokens[2]));
                    } catch (NumberFormatException nfe) {
                        currentEngine = new Engine(tokens[0], Integer.parseInt(tokens[1]), tokens[2]);
                    }
                    break;
                case 4:
                    currentEngine = new Engine(tokens[0], Integer.parseInt(tokens[1]), Integer.parseInt(tokens[2]), tokens[3]);
                    break;
                default:
                    System.out.println("ERROR There is some input Error!");
                    break;
            }
            ourEngines.put(tokens[0], currentEngine);
        }
    }
}
