package Oops.ConstructorChaning;

public class Student {
    int id;
    String name;
    String dept;

    Student(){
        System.out.println("Zero para");
    }

    Student(int id){
        this.id = id;
    }

    Student(int id,String name){
        this(id);
        this.name= name;
    }

    Student(int id,String name,String dept){
        this(id,name);
        this.dept= dept;
    }

    void display(){
        System.out.println("Name: "+this.name);
        System.out.println("Id: "+this.id);
        System.out.println("Dept: "+this.dept);
    }


}
