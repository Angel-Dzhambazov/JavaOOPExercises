package oop.exercises.e02encapsulation.p04_ShoppingSpree;

import java.util.LinkedList;
import java.util.List;

public class Person {
    private String name;
    private Integer money;
    private List<String> products;

    public Person(String name, Integer money) {
        this.setName(name);
        this.setMoney(money);
        products = new LinkedList<>();
    }

    public void setName(String name) {
        this.name = name.trim();
    }

    public void setMoney(Integer money) {
        if (money < 0) {
            throw new IllegalArgumentException("Money cannot be negative");
        } else {
            this.money = money;
        }
    }

    public void buyProduct(Product product) {
        if (this.money >= product.getPrice()) {
            this.money -= product.getPrice();
            this.products.add(product.getName());
            System.out.println(String.format("%s bought %s", this.name, product.getName()));
        } else {
            System.out.println(String.format("%s can't afford %s", this.name, product.getName()));
        }
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append(this.name);
        if (this.products.size() == 0) {
            sb.append(" - Nothing bought");
        } else {
            sb.append(" - ").append(String.join(", ", this.products));
        }
        return sb.toString();
    }
}
