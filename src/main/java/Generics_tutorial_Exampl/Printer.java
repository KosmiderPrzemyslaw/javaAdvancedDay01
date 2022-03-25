package Generics_tutorial_Exampl;

public class Printer<T> {
    T thingToPrint;

    public Printer(T thingToPrint) {
        this.thingToPrint = thingToPrint;
    }

    public Printer() {
    }

    public void  print(T thingToPrint){
        System.out.println(thingToPrint);
    }
}
