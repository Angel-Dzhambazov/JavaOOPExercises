package oop.exercises.e02encapsulation.p03_AnimalFarm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        Integer age = Integer.parseInt(reader.readLine());
        try {
            DecimalFormat df = new DecimalFormat("#.##");
            Chicken chicken = new Chicken(name, age);
            System.out.println(String.format("Chicken %s (age %d) can produce %s eggs per day.", chicken.getName(), chicken.getAge(), df.format(chicken.productPerDay())));

        } catch (IllegalArgumentException iae){
            System.out.println(iae.getMessage());
        }

    }
}
