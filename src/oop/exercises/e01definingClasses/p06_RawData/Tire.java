package oop.exercises.e01definingClasses.p06_RawData;

public class Tire {
    private Double pressure;
    private Integer age;

    public Tire(Double pressure, Integer age) {
        this.pressure = pressure;
        this.age = age;
    }

    public Double getPressure() {
        return this.pressure;
    }
}
