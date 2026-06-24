package Oops.Inheritance.MultiPerson;

public class Person {
    String name;
    int age;

    Person(String name,int age){
        this.name = name;
        this.age = age;
    }

    static {
        System.out.println("Person SB");
    }
    {
        System.out.println("Person NB");
    }

    void displayPerson(){
        System.out.println("Name: "+this.name+" age: "+this.age);
    }
}
