package oop.exercises.e02encapsulation.p05_PizzaCalories;

public class Dough {
    private String flourType;
    private String bakingTechnique;
    private Integer weight;


    public Dough(String flourType, String bakingTechnique, Integer weight) {
        this.setDough(flourType, bakingTechnique);
        this.setWeight(weight);
    }

    private void setDough(String flourType, String bakingTechnique) {
        if (Constants.DOUGH_TYPES.containsKey(flourType) && Constants.BAKING_TECHNIQUES.containsKey(bakingTechnique)) {
            this.flourType = flourType;
            this.bakingTechnique = bakingTechnique;
        } else {
            throw new IllegalArgumentException("Invalid type of dough.");
        }
    }

    private void setWeight(int weight) {
        if (weight > 0 && weight < 201) {
            this.weight = weight;
        } else {
            throw new IllegalArgumentException("Dough weight should be in the range [1..200].");
        }
    }

    public Double getDoughCalories() {
        return 2 * this.weight * Constants.DOUGH_TYPES.get(this.flourType) * Constants.BAKING_TECHNIQUES.get(this.bakingTechnique);
    }
}
