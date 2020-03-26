package oop.exercises.e01definingClasses.p09_Google;

public class Car {
    private String model;
    private Integer speed;


    public Car(String model, String speed) {
        this.model = model;
        this.speed = Integer.parseInt(speed);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%s %d", model, speed));
        return sb.toString();
    }
}
