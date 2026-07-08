package Core.Oops.Relationships.HasARelationship.Aggregation.StudentLaptop;

public class Student {
    String name;
    Laptop lap;

    Student(String name,Laptop l){
        this.name = name;
        this.lap = l;
    }

    void displayStudent(){
        System.out.println("Student name: "+this.name);
        lap.displayLap();
    }
}
