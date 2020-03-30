package oop.exercises.e01definingClasses.p11_CatLady;

public abstract class Cat {
        private String name;
        private Double statistic;

    public Cat(String name, String statistic) {
        this.name = name;
        this.statistic = Double.parseDouble(statistic);
    }

    @Override
    public String toString() {
        return String.format("%s %s %.2f", this.getClass().getSimpleName(), this.name, this.statistic);
    }
}
