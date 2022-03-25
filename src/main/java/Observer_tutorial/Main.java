package Observer_tutorial;

public class Main {
    public static void main(String[] args) {
        Subject subject = new Subject();
        subject.addObserver(new Client());
        subject.addObserver(new Client2());
        subject.startWork();

    }
}
