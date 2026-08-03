package Core.NestesClasses.NonStaticNestedClass;

public class Car1 {
    class Engine{
        void start(){
            System.out.println("Engine started..");
        }
    }

    public static void main(String[] args) {
        Car1 c = new Car1();
        Car1.Engine e = c.new Engine();
        e.start();
    }
}
