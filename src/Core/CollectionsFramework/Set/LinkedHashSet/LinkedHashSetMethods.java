package Core.CollectionsFramework.Set.LinkedHashSet;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetMethods {

    public static void main(String[] args) {

        LinkedHashSet<Student> students = new LinkedHashSet<>();

        Student s1 = new Student(101, "Rahul");
        Student s2 = new Student(102, "Priya");
        Student s3 = new Student(103, "Arun");
        Student s4 = new Student(101, "Rahul");


        // =========================================================
        // 1. add()
        // From Collection interface
        // Adds one element.
        // =========================================================

        students.add(s1);
        students.add(s2);
        students.add(s3);

        System.out.println(students);


        // =========================================================
        // 2. addAll()
        // From Collection interface
        // Adds all elements from another collection.
        // =========================================================

        LinkedHashSet<Student> anotherSet = new LinkedHashSet<>();

        anotherSet.add(new Student(104, "Kiran"));
        anotherSet.add(new Student(105, "Anu"));

        students.addAll(anotherSet);

        System.out.println(students);


        // =========================================================
        // 3. contains()
        // From Collection interface
        // Checks whether an element exists.
        // =========================================================

        System.out.println(students.contains(s1));


        // =========================================================
        // 4. containsAll()
        // From Collection interface
        // Checks whether all elements of another collection exist.
        // =========================================================

        System.out.println(students.containsAll(anotherSet));


        // =========================================================
        // 5. remove()
        // From Collection interface
        // Removes the specified element.
        // =========================================================

        students.remove(s2);

        System.out.println(students);


        // =========================================================
        // 6. removeAll()
        // From Collection interface
        // Removes elements that are also present in another collection.
        // =========================================================

        students.removeAll(anotherSet);

        System.out.println(students);


        // =========================================================
        // 7. retainAll()
        // From Collection interface
        // Keeps only elements that are present in another collection.
        // =========================================================

        LinkedHashSet<Student> keepSet = new LinkedHashSet<>();

        keepSet.add(s1);

        students.retainAll(keepSet);

        System.out.println(students);


        // =========================================================
        // 8. size()
        // From Collection interface
        // Returns number of elements.
        // =========================================================

        System.out.println(students.size());


        // =========================================================
        // 9. isEmpty()
        // From Collection interface
        // Checks whether the set is empty.
        // =========================================================

        System.out.println(students.isEmpty());


        // =========================================================
        // 10. clear()
        // From Collection interface
        // Removes all elements.
        // =========================================================

        students.clear();

        System.out.println(students);


        // =========================================================
        // 11. iterator()
        // From Iterable interface
        // Returns an Iterator.
        // =========================================================

        students.add(s1);
        students.add(s2);
        students.add(s3);

        Iterator<Student> iterator = students.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }


        // =========================================================
        // 12. toString()
        // From Object class
        // Returns string representation.
        // =========================================================

        System.out.println(students.toString());


        // =========================================================
        // 13. equals()
        // From Object class
        // Compares two sets.
        // =========================================================

        LinkedHashSet<Student> copy = new LinkedHashSet<>();

        copy.add(s1);
        copy.add(s2);
        copy.add(s3);

        System.out.println(students.equals(copy));


        // =========================================================
        // 14. hashCode()
        // From Object class
        // Returns hash code of the set.
        // =========================================================

        System.out.println(students.hashCode());


        // =========================================================
        // 15. clone()
        // HashSet provides clone(), and LinkedHashSet inherits
        // the implementation from HashSet.
        //
        // It creates a shallow copy.
        // =========================================================

        LinkedHashSet<Student> cloned =
                (LinkedHashSet<Student>) students.clone();

        System.out.println(cloned);


        // =========================================================
        // LINKEDHASHSET CONSTRUCTORS
        // =========================================================

        // 1. Default constructor
        LinkedHashSet<Student> set1 = new LinkedHashSet<>();

        // 2. Initial capacity
        LinkedHashSet<Student> set2 =
                new LinkedHashSet<>(32);

        // 3. Initial capacity + load factor
        LinkedHashSet<Student> set3 =
                new LinkedHashSet<>(32, 0.75f);

        // 4. Create from another Collection
        LinkedHashSet<Student> set4 =
                new LinkedHashSet<>(students);
    }
}
