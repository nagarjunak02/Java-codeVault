package Oops.MethodOverriding.Anima;

public class Main {
    public static void main(String[] args) {

        Animal a = new Dog();      // Upcasting: Parent reference points to Child object.

        Dog d = (Dog) a;           // Downcasting: Parent reference is converted back to Child reference.

        d.bark();                  // bark() exists only in Dog class, so downcasting is required.

        a.eat();                   // Static Method:
                                    // Compiler performs Static Binding.
                                    // Since the reference type is Animal,
                                    // compiler binds the call to Animal.eat().

        d.eat();                   // Static Method:
                                  // Compiler performs Static Binding.
                                  // Since the reference type is Dog,
                                // compiler binds the call to Dog.eat().

        d = null;                  // d no longer points to any object.

        d.eat();                   // Valid.
                                    // Static methods belong to the class, not the object.
                                    // Compiler has already bound the call to Dog.eat().
                                    // Hence, no NullPointerException.

        //d.bark();                  // Runtime Error.
                                    // bark() is an instance method.
                                    // JVM needs an actual object to execute it.
                                    // Since d is null, JVM throws NullPointerException.
        System.out.println();

        Animal a1 = new Cat();
        a1.eat();
        Cat c = (Cat)a1;
        c.meow();

        a1 = null;
        a1.eat();

        c = null;
        c.eat();
        c.meow();



    }
}