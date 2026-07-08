package Oops.Polymorphism.Vehical;

public class Car extends Vehical{
    @Override
    void start(){
        System.out.println("Car started..");
    }

//    @Override
//    void start(int wheels){
//        System.out.println("Car with wheels: "+wheels+" started");
//    }

    @Override
    void stop(){
        System.out.println("Car stopped..");
    }
}
