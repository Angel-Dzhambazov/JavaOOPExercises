package oop.exercises.e01definingClasses.p09_Google;

public class Parent {
    private String name;
    private String bDay;

    public Parent(String name, String bDay) {
        this.name = name;
        this.bDay = bDay;
    }

    @Override
    public String toString() {
        return name + " " + bDay;
    }
}
