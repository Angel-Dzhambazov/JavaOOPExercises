package oop.exercises.e02encapsulation.p05_PizzaCalories;

public class Topping {
    private String name;
    private Integer weight;


    public Topping(String type, Integer weight) {
        this.setToppings(type, weight);
    }

    private void setToppings(String type, Integer weight) {
        if (Constants.TOPPINGS.containsKey(type)) {
            this.name = type;
        } else {
            throw new IllegalArgumentException(String.format("Cannot place %s on top of your pizza.", type));
        }
        if (weight > 0 && weight < 51) {
            this.weight = weight;
        } else {
            throw new IllegalArgumentException(String.format("%s weight should be in the range [1..50].", type));
        }
    }

    public Double calculateCalories() {
        return 2 * this.weight * Constants.TOPPINGS.get(this.name);
    }
}
