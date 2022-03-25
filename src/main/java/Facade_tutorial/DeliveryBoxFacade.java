package Facade_tutorial;

public class DeliveryBoxFacade {
    private DeliveryBox deliveryBox;
    private DeliveryBoxSystem deliveryBoxSystem;

    public DeliveryBoxFacade() {
        deliveryBox = new DeliveryBox();
        deliveryBoxSystem = new DeliveryBoxSystem();
    }

    public void pickupPackage() {

        deliveryBox.getUserData();
        if (deliveryBoxSystem.isUserDataValidated() && deliveryBoxSystem.isPaymentSecure()) {
            deliveryBox.openBox();
        }
    }
}
