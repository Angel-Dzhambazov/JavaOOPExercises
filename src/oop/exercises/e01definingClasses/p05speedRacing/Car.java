package oop.exercises.e01definingClasses.p05speedRacing;

public class Car {
    private String model;
    private Double amountOfFuel;
    private Double costFor1km;
    private int distanceTraveled;

    public Car(String model, Double amountOfFuel, Double costFor1km) {
        this.model = model;
        this.amountOfFuel = amountOfFuel;
        this.costFor1km = costFor1km;
        this.distanceTraveled = 0;
    }

    public void takeADrive(int kilometersToTravel) throws ArithmeticException {
        if (costFor1km * kilometersToTravel > amountOfFuel) {
            throw new ArithmeticException("Insufficient fuel for the drive");
        } else {
            this.amountOfFuel -= this.costFor1km * kilometersToTravel;
            this.distanceTraveled += kilometersToTravel;
        }
    }


    @Override
    public String toString() {
        return String.format("%s %.2f %d", this.model, this.amountOfFuel, this.distanceTraveled);
    }
}
