package Dzień_1_Klasy_abstrakcyjne;

public class Main {
    public static void main(String[] args) {
        Train trainTGV = new Train(100, "TGV", 600);
        Car carBughati = new Car(500, "chiron", "bughati");
        Vehicle[] vehicles = new Vehicle[2];
        vehicles[0] = trainTGV;
        vehicles[1] = carBughati;

        for (int i = 0; i < vehicles.length; i++) {
            System.out.println(vehicles[i].toString());
        }

        trainTGV.setTrackWidth(999);
        System.out.println(trainTGV.getTrackWidth());

    }
}
