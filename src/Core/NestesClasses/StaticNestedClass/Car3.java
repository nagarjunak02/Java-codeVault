package Core.NestesClasses.StaticNestedClass;
//Accessing non Static Members
public class Car3 {
    int wheels = 4;

    public static class Engine{
        Car3 c = new Car3();
        public void display(){
            System.out.println(c.wheels);
        }
    }

    public static void main(String[] args) {
        Car3.Engine e = new Car3.Engine();
        e.display();
    }
}
