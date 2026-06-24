package Oops.Relationships.HasARelationship.Composition.Car;

public class CarEx {
    String brand;
    String color;
    Engine engine;

    CarEx(String brand,String color,int cc, int nocy){
        this.brand = brand;
        this.color = color;
        this.engine = new Engine(cc,nocy);
    }

    public void displayCar(){
        System.out.println("Branad: "+brand);
        System.out.println("Color: "+color);
        engine.displayEngine();
    }
}
