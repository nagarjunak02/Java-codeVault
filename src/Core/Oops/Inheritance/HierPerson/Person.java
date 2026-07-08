package Core.Oops.Inheritance.HierPerson;

public class Person {
    String name;
    int age;

    Person(String name,int age){
        this.name = name;
        this.age = age;
//        System.out.println("age: "+this.age);
    }

    void displayPerson(){
        System.out.println("Name : "+this.name+" Age : "+this.age);
    }
}
