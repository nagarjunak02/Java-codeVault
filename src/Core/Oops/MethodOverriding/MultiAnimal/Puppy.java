package Core.Oops.MethodOverriding.MultiAnimal;

public class Puppy extends Dog {
    @Override
    void eat() {
        System.out.println("Puppy eating bread and milk");
        super.eat();
    }
}
