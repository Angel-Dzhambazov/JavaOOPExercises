package oop.exercises.e01definingClasses.p06_RawData;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws IOException {
        List<Car> ourCars = new LinkedList<>();
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(isr);
        int n = Integer.parseInt(reader.readLine());

        Car currentCar;
        String[] tokens;
        for (int i = 0; i < n; i++) {
            tokens = reader.readLine().split("\\s+");
            currentCar = new Car(
                    tokens[0],
                    Integer.parseInt(tokens[1]),
                    Integer.parseInt(tokens[2]),
                    Integer.parseInt(tokens[3]),
                    tokens[4],
                    Double.parseDouble(tokens[5]),
                    Integer.parseInt(tokens[6]),
                    Double.parseDouble(tokens[7]),
                    Integer.parseInt(tokens[8]),
                    Double.parseDouble(tokens[9]),
                    Integer.parseInt(tokens[10]),
                    Double.parseDouble(tokens[11]),
                    Integer.parseInt(tokens[12]));
            ourCars.add(currentCar);
        }
        String command = reader.readLine();
        if ("fragile".equals(command)) {
            ourCars.stream().filter(c -> c.getCargo().getType().equals("fragile")).filter(Car::pressureLessThan1).collect(Collectors.toList()).forEach(System.out::println);
        } else {
            ourCars.stream().filter(c -> c.getCargo().getType().equals("flamable")).filter(Car::enginePower250plus).collect(Collectors.toList()).forEach(System.out::println);
        }
    }
}
