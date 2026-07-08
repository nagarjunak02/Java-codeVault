package Core.Oops.MethodShadowing.Shape;

public class Main {
    public static void main(String[] args) {
        Shape s = new Circle("Red");
        s.info(); //Static method binding (Method Shadowing)
                 // Compiler binds the call to Shape.info() because info() is static.
                 // This demonstrates Method Hiding.

        s.draw(); // Dynamic Binding (Dynamic Method Dispatch).
                    // JVM executes Circle.draw() because draw() is overridden..

        System.out.println(s.color); //Vairable Shadowing ->compiler access shape.color because variable access depends on ref type

        System.out.println();

        Circle c = (Circle) s;
        c.info();// Static Binding. Compiler binds the call to Circle.info(). Demonstrates Method Hiding.



        c.draw(); // Dynamic Binding. JVM executes Circle.draw().Demonstrates Method Overriding.
        System.out.println(c.color); // Variable Hiding. Compiler accesses Circle.color because
                                        // the reference type is Circle.
    }
}
