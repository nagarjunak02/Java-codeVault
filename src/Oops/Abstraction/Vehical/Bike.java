package Oops.Abstraction.Vehical;

abstract public class Bike extends Vehical{

    @Override
    void start() {
        System.out.println("Bike started..");
    }

    @Override
    void ride() {
        System.out.println("riding.. Bike ");
    }
}
