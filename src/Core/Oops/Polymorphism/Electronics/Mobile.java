package Core.Oops.Polymorphism.Electronics;

public class Mobile extends Electronics{
    int ram;

    Mobile(String brand, double price,int ram) {
        super(brand, price);
        this.ram = ram;
    }

    @Override
    void displayTime() {
        super.displayTime();
        System.out.println("Ram: "+this.ram+" Time is : 12:00");
    }
}
