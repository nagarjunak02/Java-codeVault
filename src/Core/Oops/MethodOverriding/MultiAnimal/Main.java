package Core.Oops.MethodOverriding.MultiAnimal;

public class Main {
    public static void main(String[] args) {
        Animal a2 = new Animal();
        a2.eat();
        System.out.println();

        Animal a = new Dog();
        a.eat();
        System.out.println();

        Animal a1 = new Puppy();
        a1.eat();
        System.out.println();

        Dog d = new Puppy();
        d.eat();
    }
}
