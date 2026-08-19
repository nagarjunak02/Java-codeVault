package Core.CollectionsFramework.Set.TreeSet;

import java.util.Iterator;
import java.util.TreeSet;

class Student implements Comparable<Student> {

    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // =========================================================
    // Comparable interface
    // TreeSet uses compareTo() for sorting.
    // =========================================================

    @Override
    public int compareTo(Student other) {
        return Integer.compare(this.id, other.id);
    }

    // =========================================================
    // toString()
    // From Object class
    // Used when printing Student objects.
    // =========================================================

    @Override
    public String toString() {
        return id + " - " + name;
    }
}

