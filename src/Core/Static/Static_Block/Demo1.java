package Core.Static.Static_Block;

public class Demo1 {

    // Static variable belongs to the class.
    // Memory is allocated when the class is loaded.
    static int i;

    // Instance variable belongs to the object.
    // Memory is allocated only when an object is created.
    int k;

    // Static block executes during class initialization.
    // It runs before main() and executes only once.
    static {

        // Static variable initialization
        i = 4;

        // Local variable of static block
        int j = 10;

        /*
         * At this point main() has not started yet.
         *
         * JVM has already loaded Demo1.class into memory and knows
         * the complete structure of the class (variables, methods,
         * constructors, static blocks, etc.).
         *
         * Therefore JVM can create objects even inside a static block.
         */
        Demo1 d = new Demo1();

        /*
         * Object 'd' gets its own copy of instance variable k.
         * Default value of k is 0.
         */
        d.k = 1 * j;

        System.out.println("k in static: " + d.k);

        /*
         * Current values:
         * i = 4
         * j = 10
         *
         * i becomes:
         * 4 * 10 = 40
         */
        i = i * j;
    }

    public static void main(String[] args) {

        /*
         * Execution reaches here only after:
         *
         * 1. Class Loading
         * 2. Static Variable Initialization
         * 3. Static Block Execution
         *
         * Therefore i already contains 40.
         */
        System.out.println(i);

        /*
         * New object creation.
         *
         * This is a completely different object from 'd'
         * created inside the static block.
         */
        Demo1 d1 = new Demo1();

        /*
         * Since k was never assigned for d1,
         * it contains the default value 0.
         */
        System.out.println(d1.k);
    }
}