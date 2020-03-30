package oop.exercises.e02encapsulation.p04_ShoppingSpree;

public class Product {
    private String name;
    private Integer price;


    public Product(String name, Integer price) {
        this.name = name;
        this.price = price;
    }

    public void setPrice(Integer price) {
        if (price < 0) {
            throw new IllegalArgumentException("Money cannot be negative");
        } else {
            this.price = price;
        }
    }

    public String getName() {
        return this.name;
    }

    public Integer getPrice() {
        return this.price;
    }
}
