package Core.Oops.MethodShadowing.Vehical;

public class Main {
    public static void main(String[] args) {
        Vehical v = new Car();
        v.start();

        Car c = (Car)v;
        c.start();
    }
}
