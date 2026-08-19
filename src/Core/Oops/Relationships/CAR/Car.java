package Core.Oops.Relationships.CAR;

public class Car {

    String brand;
    String color;

    Car(String brand,String color) {
        this.brand = brand;
        this.color = color;
    }

    Engine e = new Engine(2300,"petrol");



    void displayCar(){
        System.out.println("car of brand :" +this.brand+  " of color : " +this.color) ;
        e.displayEngine();
    }



}
