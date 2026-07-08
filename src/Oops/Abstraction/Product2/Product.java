package Oops.Abstraction.Product2;

public abstract class Product {
    String brand;
    String color;

    Product(String brand,String color){
        this.brand = brand;
        this.color = color;
    }

    abstract void buy();
}
