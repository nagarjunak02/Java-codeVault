package Oops.UpcastingandDowncasting.Product;

public class Main {
    public static void main(String[] args) {
        Product  p = new Mobile(1);
        Mobile m =(Mobile) p;

        System.out.println(m);
        System.out.println(m.id);
        System.out.println(m.brand);

        System.out.println();

        System.out.println(p);
        System.out.println(p.id);
        System.out.println(((Mobile) p).brand);
    }
}
