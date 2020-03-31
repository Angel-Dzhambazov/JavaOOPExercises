package oop.exercises.e02encapsulation.p05_PizzaCalories;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public final class Constants {
    public static final Map<String, Double> DOUGH_TYPES = Stream.of(new Object[][] {
            { "White", 1.5 },
            { "Wholegrain", 1.0 },
    }).collect(Collectors.toMap(data -> (String) data[0], data -> (Double) data[1]));

    public static final Map<String, Double> BAKING_TECHNIQUES = Stream.of(new Object[][] {
            { "Crispy", 0.9 },
            { "Chewy", 1.1 },
            { "Homemade", 1.0 },
    }).collect(Collectors.toMap(data -> (String) data[0], data -> (Double) data[1]));

    public static final Map<String, Double> TOPPINGS = Stream.of(new Object[][] {
            { "Meat", 1.2 },
            { "Veggies", 0.8 },
            { "Cheese", 1.1 },
            { "Sauce", 0.9 },
    }).collect(Collectors.toMap(data -> (String) data[0], data -> (Double) data[1]));
}
