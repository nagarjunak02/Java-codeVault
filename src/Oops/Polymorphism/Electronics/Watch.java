package Oops.Polymorphism.Electronics;

public class Watch extends Electronics{
    String type;

    Watch(String brand, double price,String type) {
        super(brand, price);
        this.type = type;
    }

    @Override
    void displayTime() {
        super.displayTime();
        System.out.println("Type: "+this.type+" has time: 12:00");
    }
}
