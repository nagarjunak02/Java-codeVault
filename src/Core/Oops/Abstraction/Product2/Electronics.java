package Core.Oops.Abstraction.Product2;

public abstract class Electronics extends Product{

    String battType;

    Electronics(String brand, String color,String battType) {
        super(brand, color);
        this.battType  =battType;
    }
    abstract void swithcOn();
    abstract void swithcOff();

}
