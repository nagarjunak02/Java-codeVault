package Core.Oops.ObjectMethods.Car;
//equals() method
public class Car {
    double price;

    Car(double price){
        this.price = price;
    }

    public boolean equals(Object obj){
        if((obj instanceof Car)){
            Car c = (Car)obj;
            return this.price   == c.price;
        }
        return false;
    }
}
