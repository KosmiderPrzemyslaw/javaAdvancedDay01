package Dzień_1_Klasy_abstrakcyjne;

public abstract class Vehicle {
    private int maxSpeed;
    protected String model;

    public Vehicle(int maxSpeed, String model) {
        this.maxSpeed = maxSpeed;
        this.model = model;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Vehicle{" + getClass().getName() +
                "maxSpeed=" + maxSpeed +
                ", model='" + model + '\'' +
                '}';
    }
}
