package Core.NestesClasses.ExComparableAndComparator.Student;

import java.util.Arrays;
import java.util.Comparator;

public class Main2 {
    static class NameComparator implements Comparator<Student>{
        @Override
        public int compare(Student o1, Student o2) {
            return o1.getName().compareTo(o2.getName());
        }
    }

    static class IdComparator implements Comparator<Student>{

        @Override
        public int compare(Student o1, Student o2) {
            return o1.getId().compareTo(o2.getId());
        }
    }

    static class PercentageComparator implements Comparator<Student>{

        @Override
        public int compare(Student o1, Student o2) {
            return o1.getPercent().compareTo(o2.getPercent());
        }
    }
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

        Comparator<Student> idc = new IdComparator();
        Arrays.sort(std,idc);
        System.out.println("After sorting by ID..");
        for (Student s :std ){
            System.out.println(s);
        }
        System.out.println("____________________________________________");

        Comparator<Student> namec = new NameComparator();
        Arrays.sort(std,namec);
        System.out.println("After sorting by Name..");
        for (Student s :std ){
            System.out.println(s);
        }
        System.out.println("____________________________________________");
        Comparator<Student> pc = new PercentageComparator();
        Arrays.sort(std,pc);
        System.out.println("After sorting by Percentage");
        for (Student s :std ){
            System.out.println(s);
        }


    }
}
