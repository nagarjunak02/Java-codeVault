package Core.Oops.Abstraction.Product2;

public class Main {
    public static void main(String[] args) {
        Product p = new Watch("Sonata","Black","Rechargable","Digital");
        p.buy();
        Watch w = (Watch)p;
        w.swithcOn();
        w.swithcOff();
        System.out.println();

        Electronics e = new Watch("Sonata","Black","Rechargable","Digital");
        e.buy();
        e.swithcOn();
        e.swithcOff();
    }
}
