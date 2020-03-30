package oop.exercises.e02encapsulation.p03_AnimalFarm;

import java.text.DecimalFormat;

public class Chicken {
    private String name;
    private Integer age;

    public Chicken(String name, Integer age) {
        this.setName(name);
        this.setAge(age);
    }

    public String getName() {
        return this.name;
    }

    private void setName(String name) {
        if (name == null || name.trim().length() < 1) {
            throw new IllegalArgumentException("Name cannot be empty.");
        } else {
            this.name = name;
        }
    }

    public Integer getAge() {
        return this.age;
    }

    private void setAge(Integer age) {
        if (age < 0 || age > 15) {
            throw new IllegalArgumentException("Age should be between 0 and 15.");
        } else {
            this.age = age;
        }
    }

    public Double productPerDay() {
        return calculateProductPerDay();
    }

    private Double calculateProductPerDay() {
        Double ppd = 0.0;
        if (this.age < 6) {
            ppd = 2.0;
        } else if (this.age < 12) {
            ppd = 1.0;
        } else {
            ppd = 0.75;
        }
        return ppd;
    }
}

