package Core.NestesClasses.AnonymousClass.Demo1;

public class Demo {
    public static void main(String[] args) {

        Greeting g =new Greeting() {
            @Override
            public void greet() {
                System.out.println("Hello");
            }
        };
        g.greet();
    }
}
