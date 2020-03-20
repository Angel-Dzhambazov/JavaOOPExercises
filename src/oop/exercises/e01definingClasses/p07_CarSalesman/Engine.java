package oop.exercises.e01definingClasses.p07_CarSalesman;

public class Engine {
    private String model;
    private Integer power;
    private Integer displacement;
    private String efficiency;


    public Engine(String model, Integer power) {
        this.model = model;
        this.power = power;
    }

    public Engine(String model, Integer power, Integer displacement) {
        this(model, power);
        this.displacement = displacement;
    }

    public Engine(String model, Integer power, String efficiency) {
        this(model, power);
        this.efficiency = efficiency;
    }

    public Engine(String model, Integer power, Integer displacement, String efficiency) {
        this(model, power, displacement);
        this.efficiency = efficiency;
    }

    public String getModel() {
        return this.model;
    }

    public Integer getPower() {
        return this.power;
    }

    public Integer getDisplacement() {
        return this.displacement;
    }

    public String getEfficiency() {
        return this.efficiency;
    }
}
