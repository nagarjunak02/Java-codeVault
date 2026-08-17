package Core.Basics.Object.Vehical;

public class Main {
    public static void main(String[] args) {
        //without constructor..
        Bike b1 = new Bike();
        b1.color = "blue";
        b1.brand = "tvs";
        b1.display();

        Bike b2 = new Bike();
        b2.color = "black";
        b2.brand = "suzuki";
        b2.display();


        //with constructor
        Ksrtc  k = new Ksrtc();

    }
}
