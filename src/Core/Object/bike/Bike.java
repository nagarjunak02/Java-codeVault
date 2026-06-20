package Core.Object.bike;

public class Bike {
    int cc;
    String brand;
    String color;

    void startBike(){
        System.out.println("Started bike of "+brand+" of color "+color+" which has cc : "+cc);
    }

    void stopBike(){
        System.out.println("stopped bike of "+brand+" of color "+color+" which has cc : "+cc);
    }
}
