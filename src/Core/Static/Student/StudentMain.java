package Core.Static.Student;

public class StudentMain {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();

        s1.id = 1;
        s1.name = "A";
        s1.year = 2;
        s1.sports();
        Student.study(s1.name);

        s2.id = 2;
        s2.name = "B";
        s2.year = 3;

        Student.study(s2.name);

    }
}
