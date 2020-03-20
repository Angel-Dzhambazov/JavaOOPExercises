package oop.exercises.e01definingClasses.p06_RawData;

public class Cargo {
    private Integer weigth;
    private String type;

    public Cargo(Integer weigth, String type) {
        this.weigth = weigth;
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
