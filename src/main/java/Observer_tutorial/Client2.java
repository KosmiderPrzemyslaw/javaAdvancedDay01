package Observer_tutorial;

public class Client2 implements Observer {
    @Override
    public void update() {
        System.out.println("Koniec pracy" + getClass().getName());
    }
}
