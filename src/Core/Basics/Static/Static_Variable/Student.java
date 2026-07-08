package Core.Basics.Static.Static_Variable;

public class Student {
    String name;
    int id;
    static String collage;

    void study(){
        System.out.println(name+" is studing in cllg "+collage+" has id "+id);
    }

    public static void main(String[] args) {
        Student s = new Student();
        s.id =1;
        s.name = "A";
        Student.collage = "SVIT";
        s.study();
    }

}
