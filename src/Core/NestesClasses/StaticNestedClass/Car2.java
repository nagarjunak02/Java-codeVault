package Core.NestesClasses.StaticNestedClass;
//Accessing Static Members

public class Car2 {
    static int wheels = 4;

    public static class Engine{
        public void display(){
            System.out.println(Car2.wheels);
        }
    }

    public static void main(String[] args) {
        Car2.Engine e = new Car2.Engine();
        e.display();
    }
}
