package Core.MethodShadowing.Shape;

public class Shape {
    String color;

    Shape(String color){
        this.color = color;
    }

    static void info(){
        System.out.println("info of shapes...");
    }

    void draw(){
        System.out.println("Drawing shape with color: "+this.color);
    }

}
