package Core.NestesClasses;

public class LocalInnerClassEx1 {

    void display(){
        class Inner{
            void show(){
                System.out.println("Inside Local Inner Class");
            }
        }
        Inner i = new Inner();
        i.show();
    }

    public static void main(String[] args) {
        LocalInnerClassEx1 l = new LocalInnerClassEx1();
        l.display();
    }
}
