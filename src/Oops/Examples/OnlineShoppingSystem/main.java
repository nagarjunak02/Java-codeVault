package Oops.Examples.OnlineShoppingSystem;

public class main {
    public static void main(String[] args) {
        Product.cmpy = "Tvs";
        Product p1 = new Product(12,"RTX 300",2750000.0);
        p1.display();
        p1.display(true);
    }
}
