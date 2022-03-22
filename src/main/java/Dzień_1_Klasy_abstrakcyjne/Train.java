package Dzień_1_Klasy_abstrakcyjne;

public class Train extends Vehicle {
    int trackWidth;

    public Train(int maxSpeed, String model, int trackWidth) {
        super(maxSpeed, model);
        this.trackWidth = trackWidth;
    }

    public int getTrackWidth() {
        return trackWidth;
    }

    public void setTrackWidth(int trackWidth) {
        this.trackWidth = trackWidth;
    }
}
