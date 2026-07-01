package Oops.MethodOverriding.MultiAnimal;

public class Dog extends Animal{
    @Override
    void eat() {
        System.out.println("Dog eating Pedigre");
        super.eat();
    }
}
