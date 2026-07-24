package Core.Oops.Interface.MultipleInheritance;

public class Laptop implements Prodcut,Electonics{
    @Override
    public void swithOn() {
        System.out.println("Laptop swithcOn..");
    }

    @Override
    public void buyProd() {
        System.out.println("Laptop brought..");
    }
}
