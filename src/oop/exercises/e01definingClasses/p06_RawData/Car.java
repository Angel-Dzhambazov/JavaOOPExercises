package oop.exercises.e01definingClasses.p06_RawData;

import java.util.HashMap;
import java.util.Map;

public class Car {
    private String model;
    private Engine engine;
    private Cargo cargo;
    private Map<Integer, Tire> tires;

    public Car(String model, Integer engineSpeed, Integer enginePower, Integer cargoWeight, String cargoType, Double tire1Pressure, Integer tire1Age,
               Double tire2Pressure, Integer tire2Age, Double tire3Pressure, Integer tire3Age, Double tire4Pressure, Integer tire4Age) {
        this.model = model;
        this.engine = new Engine(engineSpeed, enginePower);
        this.cargo = new Cargo(cargoWeight, cargoType);
        this.tires = new HashMap<>();
        this.tires.put(1, new Tire(tire1Pressure, tire1Age));
        this.tires.put(2, new Tire(tire2Pressure, tire2Age));
        this.tires.put(3, new Tire(tire3Pressure, tire3Age));
        this.tires.put(4, new Tire(tire4Pressure, tire4Age));
    }

    public Cargo getCargo() {
        return this.cargo;
    }

    public boolean pressureLessThan1() {
        boolean result = false;
        for (Tire currentTire : tires.values()) {
            if (currentTire.getPressure() < 1) {
                result = true;
                break;
            }
        }
        return result;
    }

    public boolean enginePower250plus() {
        return engine.getPower() > 250;
    }

    @Override
    public String toString() {
        return this.model;
    }
}
