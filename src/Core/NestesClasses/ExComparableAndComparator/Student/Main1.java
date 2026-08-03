package Core.NestesClasses.ExComparableAndComparator.Student;

import java.util.Arrays;

public class Main1 {
    public static void main(String[] args) {
        Student s1 = new Student(1,"Ramesh",76.0,21);
        Student s2 = new Student(5,"Rajesh",96.0,33);
        Student s3 = new Student(3,"Rakesh",71.0,32);
        Student s4 = new Student(9,"Roopesh",42.0,23);
        Student s5 = new Student(7,"Karun",89.0,35);
        Student s6 = new Student(2,"Pavan",77.0,19);


        Student[] std = {s1,s2,s3,s4,s5,s6};
        System.out.println("Before sorting..");
        for (Student s :std ){
            System.out.println(s);
        }
        Arrays.sort(std);

        System.out.println("After sorting..");
        for(Student s : std){
            System.out.println(s);
        }
    }
}
