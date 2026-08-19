package Core.CollectionsFramework.Set.HashSet;

public class Student implements  Comparable<Student>{
    Integer id;
    String name;

    public Student(Integer id, String name) {
        this.id = id;
        this.name = name;
    }


    @Override
    public int compareTo(Student o) {
        return -(this.id.compareTo(o.id));
    }

    @Override
    public String toString() {
        return "[id : "+this.id+" , name: "+this.name+"]";
    }
}
