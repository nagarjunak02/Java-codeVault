class Animal {

    String name = "Animal";
}

class Dog extends Animal {

    String name = "Dog";
}

public class Main {

    public static void main(String[] args) {

        Animal a = new Dog();

        Dog d = (Dog)a;

        System.out.println(a.name);

        System.out.println(d.name);
    }
}