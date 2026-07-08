package Core.Oops.Polymorphism.Electronics;

public class Electronics {
    String brand;
    double price;
    Electronics(String brand,double price){
        this.price = price;
        this.brand = brand;
    }

    void displayTime(){
        System.out.println("barnd: "+brand+" Price: "+price);
    }
}
