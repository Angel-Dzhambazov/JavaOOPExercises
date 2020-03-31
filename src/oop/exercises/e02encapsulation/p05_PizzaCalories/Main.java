package oop.exercises.e02encapsulation.p05_PizzaCalories;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] command = reader.readLine().split("\\s+");


        try {
            Pizza pizza = new Pizza(command[1],Integer.parseInt(command[2]));
            command = reader.readLine().split("\\s+");
            Dough dough = new Dough(command[1], command[2], Integer.parseInt(command[3]));
            pizza.setDough(dough);
            Topping currentTopping;
            for (int i = 0; i < pizza.getNumberOfToppings(); i++) {
                command = reader.readLine().split("\\s+");
                currentTopping = new Topping(command[1], Integer.parseInt(command[2]));
                pizza.addTopping(currentTopping);
            }
            System.out.println(pizza.toString());



        } catch (IllegalArgumentException iae) {
            System.out.println(iae.getMessage());
        }
    }
}
