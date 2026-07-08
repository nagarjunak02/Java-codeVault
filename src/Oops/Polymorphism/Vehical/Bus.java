package Oops.Polymorphism.Vehical;

public class Bus extends Vehical{
    @Override
    void start(){
        System.out.println("Bus started..");
    }

    @Override
    void start(int wheels){
        System.out.println("Bus with wheels: "+wheels+" started");
    }

    @Override
    void stop(){
        System.out.println("Bus stopped..");
    }
}
