package Core.Basics.Object.Vehical;

public class Ksrtc {
    String color;
    String brand;

    Ksrtc(){
        System.out.println("default constructor...");
    }

    void display(){
        System.out.println("Going by bus with color : "+this.color+" of brand : "+this.brand);
    }
}
