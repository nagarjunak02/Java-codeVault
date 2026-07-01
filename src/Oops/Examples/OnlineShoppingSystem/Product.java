package Oops.Examples.OnlineShoppingSystem;

public class Product {
    int pid;
    String pname;
    double price;
    static String cmpy;


    static {
        System.out.println("Welcome to Online Shopping System...");
    }
    {
        System.out.println("Thanks for selecting the details.. and please find the above details for the item..");
    }
    Product(){
    }

    Product(int pid){
        this.pid = pid;
    }

    Product(int pid, String pname) {
        this(pid);
        this.pname = pname;
    }

    Product(int pid, String pname, double price) {
        this(pid,pname);
        this.price = price;
    }

    void display(){
        System.out.println("Product Id: "+this.pid);
        System.out.println("Product Name: "+this.pname);
        System.out.println("From Company: "+Product.cmpy);
    }

    void display(boolean showprice){
        if(showprice){
            System.out.println("Price is : "+this.price);
        }
    }

}
