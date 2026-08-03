package Core.NestesClasses.NonStaticNestedClass;

public class Car3 {
    static int wheels = 4;

    class Engine{
        void display(){
            System.out.println(wheels);
        }
    }

    public static void main(String[] args) {
        Car3 c = new Car3();
        Car3.Engine e = c.new Engine();
        e.display();
    }

}
