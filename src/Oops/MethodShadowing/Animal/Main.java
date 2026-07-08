package Oops.MethodShadowing.Animal;

public class Main {
    public static void main(String[] args) {
        Animal a = new Dog(); //Upcasting
        a.eat();

        Dog d = (Dog)a; //Downcasting
        d.eat();


    }
}
