package Core.CollectionsFramework.LinkedList.Student;

public class Student {
    String name;
    Integer id;

    Student(String name,Integer id){
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student [ name : "+this.name+" ,id : "+this.id+" ]";
    }
}
