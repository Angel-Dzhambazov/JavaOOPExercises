package oop.exercises.e01definingClasses.p05speedRacing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    private static List<Car> cars;
    private static Map<String, Car> carsAsMap;

    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(isr);
        cars = new LinkedList<>();
        carsAsMap = new HashMap<>();

        int n = Integer.parseInt(reader.readLine());
        Car tempCar;
        for (int i = 0; i < n; i++) {
            String[] carTokens = reader.readLine().split("\\s+");
            tempCar = new Car(carTokens[0], Double.parseDouble(carTokens[1]), Double.parseDouble(carTokens[2]));
            cars.add(tempCar);
            carsAsMap.put(carTokens[0], tempCar);
        }
        String[] currentLine = reader.readLine().split("\\s+");
        while (!"End".equals(currentLine[0])) {

            try {
                carsAsMap.get(currentLine[1]).takeADrive(Integer.parseInt(currentLine[2]));
            } catch (ArithmeticException ae) {
                System.out.println(ae.getMessage());
            }
            currentLine = reader.readLine().split("\\s+");
        }

        for (Car car : cars) {
            System.out.println(car.toString());
        }

    }
}
