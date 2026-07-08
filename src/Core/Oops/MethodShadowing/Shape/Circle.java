package Core.Oops.MethodShadowing.Shape;

public class Circle extends Shape{
    String color = "Blue";

    Circle(String color) {
        super(color);
    }

    static void info(){
        System.out.println("info of circle");
    }

    void draw(){
        System.out.println("Drawing circle with color: "+this.color);
    }
}
