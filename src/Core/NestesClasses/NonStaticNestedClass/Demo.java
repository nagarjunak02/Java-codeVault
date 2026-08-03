package Core.NestesClasses.NonStaticNestedClass;

public class Demo {
    void display(){
        System.out.println("Outer class");
    }
    class Inner{
        void show(){
            display();
        }
    }

    public static void main(String[] args) {
        Demo d = new Demo();
        Demo.Inner i = d.new Inner();
        i.show();
    }
}
