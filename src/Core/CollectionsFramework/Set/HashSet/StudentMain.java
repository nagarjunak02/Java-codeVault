package Core.CollectionsFramework.Set.HashSet;

import java.util.HashSet;

public class StudentMain {
    public static void main(String[] args) {
        HashSet<Student> hs = new HashSet<>();
        HashSet<Student> hs1 = new HashSet<>();
        Student s1 = new Student(1,"ada");
        Student s2 = new Student(78,"h");
        Student s3 = new Student(2,"a");
        Student s4 = new Student(4,"f");

        hs.add(s1);
        hs.add(s1);
        hs.add(s2);
        hs.add(s3);
        hs.add(s4);
        System.out.println(hs);

        System.out.println(hs1);
        hs.clear();
        System.out.println(hs);

        System.out.println(hs.isEmpty());

        System.out.println(hs1.toArray());


    }
}
