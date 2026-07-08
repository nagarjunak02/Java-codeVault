package Core.Oops.Abstraction.Vehical;

public class Main {
    public static void main(String[] args) {
        EleBike e = new EleBike();
        e.start();
        e.ride();
        e.stop();

        System.out.println();
        Vehical ev = new EleBike();
        ev.start();
        ev.ride();
        ev.stop();

        System.out.println();
        ev = new EleBike();
        ev.start();
        ev.ride();
        ev.stop();

    }
}
