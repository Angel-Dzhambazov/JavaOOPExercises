package oop.exercises.e02encapsulation.p02_ClassBox;


public class Box {
    private Double length;
    private Double width;
    private Double height;


    public Box(Double length, Double width, Double height) {
        this.setLength(length);
        this.setWidth(width);
        this.setHeight(height);
    }

    private void setLength(Double length) {
        if (length <= 0.0) {
            throw new IllegalArgumentException("Length cannot be zero or negative.");
        }
        this.length = length;
    }

    private void setWidth(Double width) {
        if (width <= 0.0) {
            throw new IllegalArgumentException("Width cannot be zero or negative.");
        }
        this.width = width;
    }

    private void setHeight(Double height) {
        if (height <= 0.0) {
            throw new IllegalArgumentException("Height cannot be zero or negative.");
        }
        this.height = height;
    }

    private Double calculateArea() {
        return 2 * length * width + 2 * length * height + 2 * width * height;
    }

    private Double calculateLateral() {
        return 2 * length * height + 2 * width * height;
    }

    private Double calculateVolume() {
        return length * width * height;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Surface Area - %.2f", this.calculateArea())).append(System.lineSeparator());
        sb.append(String.format("Lateral Surface Area - %.2f", this.calculateLateral())).append(System.lineSeparator());
        sb.append(String.format("Volume - %.2f", this.calculateVolume()));
        return sb.toString();
    }

}
