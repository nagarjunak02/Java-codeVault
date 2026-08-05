package Core.Oops.Inheritance.HierPerson;

public class Student extends Person{
    String usn;

    Student(String name, int age,String usn) {
        super(name, age);
        this.usn = usn;
    }

    void displayStudent(){
        System.out.println("StudentClass name: "+super.name+" age : "+super.age+" USN : "+this.usn);
    }
}
