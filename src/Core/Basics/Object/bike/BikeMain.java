package Core.Basics.Object.bike;

public class BikeMain {
    public static void main(String[] args) {
        Bike b= new Bike();
        b.cc = 300;
        b.color = "Blue";
        b.brand = "Tvs Apache RTX";

        b.stopBike();
        b.stopBike();
    }
}
