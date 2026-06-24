package Oops.Inheritance.HierPerson;

public class Teacher extends Person{
        String sub;

    Teacher(String name, int age,String sub) {
        super(name, age);
        this.sub = sub;
    }

    void displayTeacher(){
                System.out.println("Name : "+super.name+" age : "+super.age+" Subject: "+this.sub);
            }
}
