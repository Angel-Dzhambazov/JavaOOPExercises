package oop.exercises.e01definingClasses.p06_RawData;

public class Engine {
    private Integer speed;
    private Integer power;

    public Engine(Integer speed, Integer power) {
        this.speed = speed;
        this.power = power;
    }

    public Integer getPower() {
        return this.power;
    }
}
