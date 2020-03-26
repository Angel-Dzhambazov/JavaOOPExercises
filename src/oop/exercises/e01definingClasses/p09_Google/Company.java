package oop.exercises.e01definingClasses.p09_Google;

public class Company {
    private String name;
    private String department;
    private Double salary;

    public Company(String name, String department, String salary) {
        this.name = name;
        this.department = department;
        this.salary = Double.parseDouble(salary);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(String.format("%s %s %.2f", name, department, salary));

        return sb.toString();
    }
}
