package Core.Basics.Static.Static_Method;

public class Ex1 {
    String name;
    static String collage;

    static void display(){
        Ex1 e = new Ex1();
        e.name = "B";
        System.out.println("Student "+e.name+" has Studing in cllg "+collage);
    }

    public static void main(String[] args) {
        Ex1 e = new Ex1();
        e.name = "A";
        System.out.println(e.name);
        Ex1.collage = "SVIT";
        display();
    }
}
