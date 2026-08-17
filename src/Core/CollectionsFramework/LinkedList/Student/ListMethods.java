package Core.CollectionsFramework.LinkedList.Student;

import java.util.LinkedList;

public class ListMethods {
    public static void main(String[] args) {

        LinkedList<Student> ls = new LinkedList<>();

        // Creating Students Objects
        Student s1 = new Student("A", 2);
        Student s2 = new Student("B", 5);
        Student s3 = new Student("C", 8);
        Student s4 = new Student("D", 10);

        // =================== List Methods ===================

        // add(E)
        ls.add(s1);
        ls.add(s2);
        ls.add(s3);

        System.out.println("After add(E)");
        System.out.println(ls);

        // add(index, E)
        ls.add(1, s4);

        System.out.println("\nAfter add(index, E)");
        System.out.println(ls);

        // get(index)
        System.out.println("\nElement at index 2");
        System.out.println(ls.get(2));

        // set(index, E)
        Student s5 = new Student("E", 15);

        ls.set(2, s5);

        System.out.println("\nAfter set()");
        System.out.println(ls);

        // remove(index)
        ls.remove(1);

        System.out.println("\nAfter remove(index)");
        System.out.println(ls);

        // contains()
        System.out.println("\nContains s1 : " + ls.contains(s1));

        // indexOf()
        System.out.println("Index of s3 : " + ls.indexOf(s3));

        // lastIndexOf()
        ls.add(s1);

        System.out.println("Last Index of s1 : " + ls.lastIndexOf(s1));

        // size()
        System.out.println("Size : " + ls.size());

        // isEmpty()
        System.out.println("Is Empty : " + ls.isEmpty());

        // clear()
        ls.clear();

        System.out.println("\nAfter clear()");
        System.out.println(ls);

        System.out.println("Is Empty : " + ls.isEmpty());
    }
}