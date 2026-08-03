package Core.NestesClasses.NonStaticNestedClass;

public class Car2 {
    int price = 200000;

    class Engine{
        void display(){
            System.out.println(price);
        }
    }

    public static void main(String[] args) {
        Car2 c = new Car2();
        Car2.Engine e = c.new Engine();
        e.display();
    }
}
