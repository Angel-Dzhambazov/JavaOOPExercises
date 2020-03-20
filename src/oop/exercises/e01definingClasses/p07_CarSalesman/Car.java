package oop.exercises.e01definingClasses.p07_CarSalesman;


public class Car {
    private String model;
    private Engine engine;
    private Integer weight;
    private String color;


    public Car(String model, Engine engine) {
        this.model = model;
        this.engine = engine;
    }

    public Car(String model, Engine engine, Integer weight, String color) {
        this(model, engine, weight);
        this.color = color;
    }

    public Car(String model, Engine engine, String color) {
        this(model, engine);
        this.color = color;
    }

    public Car(String model, Engine engine, Integer weight) {
        this(model, engine);
        this.weight = weight;
    }

    @Override
    public String toString() {
        StringBuilder output = new StringBuilder();
        output.append(this.model + ":").append(System.lineSeparator());
        output.append(this.engine.getModel() + ":").append(System.lineSeparator());
        output.append(String.format("Power: %d", engine.getPower())).append(System.lineSeparator());
        if (engine.getDisplacement() != null) {
            output.append(String.format("Displacement: %d", engine.getDisplacement())).append(System.lineSeparator());
        } else {
            output.append(String.format("Displacement: n/a")).append(System.lineSeparator());
        }
        output.append(String.format("Efficiency: %s", engine.getEfficiency() != null ? engine.getEfficiency() : "n/a")).append(System.lineSeparator());;

        if (this.weight != null) {
            output.append(String.format("Weight: %d", this.weight)).append(System.lineSeparator());
        } else {
            output.append(String.format("Weight: n/a")).append(System.lineSeparator());
        }
        output.append(String.format("Color: %s", this.color != null ? this.color : "n/a"));

        return output.toString();
    }
}
