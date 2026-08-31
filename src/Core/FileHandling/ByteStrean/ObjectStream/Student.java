package Core.FileHandling.ByteStrean.ObjectStream;

import java.io.*;


// ============================================================
// Serializable class
// ============================================================

class Student implements Serializable {

    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{id=" + id + ", name='" + name + "'}";
    }
}