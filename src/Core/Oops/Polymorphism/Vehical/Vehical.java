package Core.Oops.Polymorphism.Vehical;

public class Vehical {
    void start(){
        System.out.println("Vehical started..");
    }

    void start(int wheels){
        System.out.println("Vehical with wheels: "+wheels+" started");
    }

    void stop(){
        System.out.println("Vehical stopped..");
    }
}
