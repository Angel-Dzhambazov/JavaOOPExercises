package oop.exercises.e02encapsulation.p05_PizzaCalories;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private String name;
    private int numberOfToppings;
    private List<Topping> toppings;
    private Dough dough;


    public Pizza(String name, Integer n) {
        this.setName(name);
        this.setNumberOfToppings(n);
        this.toppings = new ArrayList<>();
    }

    private void setName(String name) {
        if (name == null || name.trim().length() == 0 || name.trim().length() > 15) {
            throw new IllegalArgumentException("Pizza name should be between 1 and 15 symbols.");
        }
        this.name = name;
    }

    private void setNumberOfToppings(int numberOfToppings) {
        if (numberOfToppings < 0 || numberOfToppings > 10) {
            throw new IllegalArgumentException("Number of toppings should be in range [0..10].");
        }
        this.numberOfToppings = numberOfToppings;
    }

    public void setDough(Dough dough) {
        this.dough = dough;
    }

    public int getNumberOfToppings() {
        return this.numberOfToppings;
    }

    public void addTopping(Topping topping){
        this.toppings.add(topping);
    }

    private Double calculateCalories() {
        Double result = this.dough.getDoughCalories();
        for (Topping topping : toppings) {
            result += topping.calculateCalories();
        }
        return result;
    }
    @Override
    public String toString() {

        return String.format("%s - %.2f", this.name, this.calculateCalories());
    }

}
