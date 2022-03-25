package Dzień_1_Interfejsy.Zadania.Zad3;

public class Main {
    public static void main(String[] args) {
        Moveable[] moveables = new Moveable[3];
        Person person = new Person();
        Cat cat = new Cat();
        Car car = new Car();
        moveables[0] = person;
        moveables[1] = cat;
        moveables[2] = car;

        for (Moveable m: moveables
             ) {
            m.start();
        }
    }
}
