package oop.exercises.e01definingClasses.p01;

public class Person {
    private String name;
    private int age;

    private static final String DEFAULT_NAME = "No name";
    private static final int DEFAULT_AGE = 1;

    public Person(int age) {
        this(DEFAULT_NAME, age);
    }

    public Person() {
        this.name = DEFAULT_NAME;
        this.age = DEFAULT_AGE;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format("%s - %d", this.name, this.age);
    }
}
