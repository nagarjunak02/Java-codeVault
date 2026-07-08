package Core.Basics.Static.Student;

public class Student {
    String name;
    int id;
    int year;
    static  String collage;

    void sports(){
        System.out.println(name+" has participating in sports ");
    }

    static void study(String name){
        System.out.println(name+" is studing..");
    }
}
