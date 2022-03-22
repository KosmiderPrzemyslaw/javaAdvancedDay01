package Dzień_1_Klasy_abstrakcyjne;

public class Car extends Vehicle {
    private String type;
    protected String owner;

    public Car(int maxSpeed, String model, String type) {
        super(maxSpeed, model);
        this.type = type;
    }


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
