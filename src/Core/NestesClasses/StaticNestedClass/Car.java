package Core.NestesClasses.StaticNestedClass;

public class Car {

    static class Enginee{
        public void start(){
            System.out.println("Enginee Started..");

        }
    }

    public static void main(String[] args) {
        Car.Enginee e = new Car.Enginee();
        e.start();
    }
}
