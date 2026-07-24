package Core.Oops.Interface.MultipleChanningConstructor;

public class Flipkart extends Application implements Website{
    Flipkart(String userName, String pass) {
        super(userName, pass);
    }

    @Override
    public void login() {
        System.out.println("Logged in with username: "+super.userName);
    }

    @Override
    public void serachProduct() {
        System.out.println("Search here..");
    }

    @Override
    public void addToCart() {
        System.out.println("Product added to cart");
    }

}

/*
Website says

↓

Every implementing class must have

        addToCart()

        ↓

Does Flipkart have addToCart()?

        ↓

No

↓

Check superclass

↓

Application has addToCart()

↓

Contract satisfied

↓

Compilation Successful
        */