package Core.Oops.Polymorphism.Vehical;

public class Bike extends Vehical{

    @Override
    void start() {
        System.out.println("Bike started..");
    }

    @Override
    void start(int wheels) {
        System.out.println("Bike with wheels: "+wheels+" started..");
    }

    @Override
    void stop() {
        super.stop();
    }
}
