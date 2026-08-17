package Core.Basics.Object;

public class Main
{
    public static void main(String[] args) {
        Student s = new Student();
        s.id= 101;
        s.name = "anc";

        Student.cllg = "Svit";
        Student.displayCllg();

        System.out.println(s.id);
        System.out.println(s.name);
        System.out.println(s);
    }
}
