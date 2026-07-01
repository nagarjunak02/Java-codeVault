package Oops.UpcastingandDowncasting.Hospital;

public class Person {
    String name;
    int age;

    Person(String name,int age){
        this.name = name;
        this.age =age;
    }

    void displayPerson(){
        System.out.println("Name: "+this.name+" age : "+this.age);
    }
}
