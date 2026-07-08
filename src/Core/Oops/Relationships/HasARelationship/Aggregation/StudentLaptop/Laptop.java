package Core.Oops.Relationships.HasARelationship.Aggregation.StudentLaptop;

public class Laptop {
    String brand;
    Laptop(String brand){
        this.brand = brand;
    }

    void displayLap(){
        System.out.println("Brand: "+brand);
    }
}
