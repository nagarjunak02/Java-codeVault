package Oops.MethodOverriding.Electronics;

public class Main {
    public static void main(String[] args) {
        Electonics e = new Mobile();
        e.powerOn();



        Electonics e1 = new Laptop();
        e1.powerOn();
    }
}
