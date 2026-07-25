package Core.Oops.ObjectMethods.Car;

public class Main {
    public static void main(String[] args) {
        Car c = new Car(1000);
        System.out.println(c.equals(1000));

        Car c1 = new Car(1000);
        System.out.println(c.equals(c1));
    }
}
