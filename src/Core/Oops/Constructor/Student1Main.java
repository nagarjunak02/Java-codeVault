package Core.Oops.Constructor;

public class Student1Main {
    public static void main(String[] args) {
        Student1 s1 = new Student1(1,"A",98);
        Student1 s2 = new Student1(2,"B",87);
        Student1.cllg = "SVIT";
        s1.studentDisplay();
        s2.studentDisplay();
    }
}
