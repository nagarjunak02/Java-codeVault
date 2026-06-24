package Oops.Inheritance.HierPerson;

public class Main {
    public static void main(String[] args) {
        Student s = new Student("Arjun",21,"asf");
        /*s.name = "Arjun";
        s.age = 21;
        s.usn = "1USN2";*/
        s.displayStudent();

        Teacher t = new Teacher("javalect",30,"Python");
        t.name = "Teac";
        t.age = 40;
        t.sub = "Java";
        t.displayTeacher();
    }
}
