package Oops.UpcastingandDowncasting.Parking;

public class VehicalMain {
    public static void main(String[] args) {
        Vehical v1 = new Car();
        Vehical v2 = new Bike();
        Vehical v3 = new Bus();

        Parking p = new Parking();
        p.allowEntry(v1);
        System.out.println();
        p.allowEntry(v2);
        System.out.println();
        p.allowEntry(v3);
        System.out.println();

//        v1.start();
//        v1.park();
//        v1.stop();
//        System.out.println();
//
//        v2.start();
//        v2.park();
//        v2.stop();
//        System.out.println();
//
//        v3.start();
//        v3.park();
//        v3.stop();

    }
}
