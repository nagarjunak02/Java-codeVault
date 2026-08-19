package Core.CollectionsFramework.Set.TreeSet;


import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetMethods {

    public static void main(String[] args) {

        TreeSet<Student> students = new TreeSet<>();

        Student s1 = new Student(101, "Rahul");
        Student s2 = new Student(102, "Priya");
        Student s3 = new Student(103, "Arun");
        Student s4 = new Student(101, "Rahul");


        // =========================================================
        // 1. add()
        // From Collection interface
        //
        // Adds an element.
        // TreeSet uses compareTo() to find its position.
        // =========================================================

        students.add(s1);
        students.add(s2);
        students.add(s3);

        System.out.println(students);


        // =========================================================
        // 2. addAll()
        // From Collection interface
        //
        // Adds all elements from another collection.
        // =========================================================

        TreeSet<Student> anotherSet = new TreeSet<>();

        anotherSet.add(new Student(104, "Kiran"));
        anotherSet.add(new Student(105, "Anu"));

        students.addAll(anotherSet);

        System.out.println(students);


        // =========================================================
        // 3. contains()
        // From Collection interface
        //
        // Checks whether an element exists.
        // TreeSet uses comparison to search.
        // =========================================================

        System.out.println(
                students.contains(s1)
        );


        // =========================================================
        // 4. containsAll()
        // From Collection interface
        //
        // Checks whether all elements of another collection exist.
        // =========================================================

        System.out.println(
                students.containsAll(anotherSet)
        );


        // =========================================================
        // 5. remove()
        // From Collection interface
        //
        // Removes an element.
        // TreeSet uses comparison to find the element.
        // =========================================================

        students.remove(s2);

        System.out.println(students);


        // =========================================================
        // 6. removeAll()
        // From Collection interface
        //
        // Removes elements that are also present
        // in another collection.
        // =========================================================

        students.removeAll(anotherSet);

        System.out.println(students);


        // =========================================================
        // 7. retainAll()
        // From Collection interface
        //
        // Keeps only elements that are present
        // in another collection.
        // =========================================================

        TreeSet<Student> keepSet = new TreeSet<>();

        keepSet.add(s1);

        students.retainAll(keepSet);

        System.out.println(students);


        // =========================================================
        // 8. size()
        // From Collection interface
        //
        // Returns number of elements.
        // =========================================================

        System.out.println(students.size());


        // =========================================================
        // 9. isEmpty()
        // From Collection interface
        //
        // Checks whether TreeSet is empty.
        // =========================================================

        System.out.println(students.isEmpty());


        // =========================================================
        // 10. clear()
        // From Collection interface
        //
        // Removes all elements.
        // =========================================================

        students.clear();


        // =========================================================
        // 11. iterator()
        // From Iterable interface
        //
        // Returns Iterator.
        //
        // TreeSet's iterator returns elements
        // in sorted order.
        // =========================================================

        students.add(s1);
        students.add(s2);
        students.add(s3);

        Iterator<Student> iterator = students.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }


        // =========================================================
        // 12. first()
        // From NavigableSet / SortedSet
        //
        // Returns the smallest element.
        // =========================================================

        System.out.println(
                students.first()
        );


        // =========================================================
        // 13. last()
        // From NavigableSet / SortedSet
        //
        // Returns the largest element.
        // =========================================================

        System.out.println(
                students.last()
        );


        // =========================================================
        // 14. lower()
        // From NavigableSet
        //
        // Returns the greatest element strictly LESS than
        // the given element.
        // =========================================================

        System.out.println(
                students.lower(s2)
        );


        // =========================================================
        // 15. higher()
        // From NavigableSet
        //
        // Returns the smallest element strictly GREATER than
        // the given element.
        // =========================================================

        System.out.println(
                students.higher(s2)
        );


        // =========================================================
        // 16. floor()
        // From NavigableSet
        //
        // Returns the greatest element LESS THAN OR EQUAL TO
        // the given element.
        // =========================================================

        System.out.println(
                students.floor(s2)
        );


        // =========================================================
        // 17. ceiling()
        // From NavigableSet
        //
        // Returns the smallest element GREATER THAN OR EQUAL TO
        // the given element.
        // =========================================================

        System.out.println(
                students.ceiling(s2)
        );


        // =========================================================
        // 18. pollFirst()
        // From NavigableSet
        //
        // Returns AND removes the smallest element.
        // =========================================================

        System.out.println(
                students.pollFirst()
        );


        // =========================================================
        // 19. pollLast()
        // From NavigableSet
        //
        // Returns AND removes the largest element.
        // =========================================================

        System.out.println(
                students.pollLast()
        );


        // =========================================================
        // 20. equals()
        // From Object / Set contract
        //
        // Compares this TreeSet with another Set.
        // =========================================================

        TreeSet<Student> copy = new TreeSet<>();

        copy.add(s2);

        System.out.println(
                students.equals(copy)
        );


        // =========================================================
        // 21. hashCode()
        // From Object
        //
        // Returns hash code of the TreeSet.
        // =========================================================

        System.out.println(
                students.hashCode()
        );


        // =========================================================
        // 22. toString()
        // From Object
        //
        // Returns String representation.
        // =========================================================

        System.out.println(
                students.toString()
        );


        // =========================================================
        // TREESET CONSTRUCTORS
        // =========================================================

        // 1. Default constructor
        TreeSet<Student> set1 = new TreeSet<>();


        // 2. Constructor using Comparator
        TreeSet<Student> set2 =
                new TreeSet<>(
                        (a, b) -> Integer.compare(b.id, a.id)
                );


        // 3. Constructor using another SortedSet
        TreeSet<Student> set3 =
                new TreeSet<>(set1);


        // 4. Constructor using another Collection
        // TreeSet also has a constructor accepting Collection
        // through the appropriate constructor hierarchy/API.
    }
}
