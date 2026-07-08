package Oops.Abstraction.Product;

public class Main {
    public static void main(String[] args) {
        Product p = new Pen();
        p.write();

        Pen pen =  new Pen();
        pen.write();
    }

}
