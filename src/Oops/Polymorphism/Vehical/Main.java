package Oops.Polymorphism.Vehical;

public class Main {
    public static void main(String[] args) {
        Vehical v;
        v = new Car();
        v.start();
        v.start(4);
        v.stop();

        System.out.println();

        v = new Bike();
        v.start();
        v.start(2);
        v.stop();

        System.out.println();

        v = new Bus();
//        v.start();
        v.start(10);
        v.stop();
    }
}
