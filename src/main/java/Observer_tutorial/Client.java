package Observer_tutorial;

public class Client implements Observer {
    @Override
    public void update() {

        System.out.println("Zakończono" + getClass().getName() );
    }
}
