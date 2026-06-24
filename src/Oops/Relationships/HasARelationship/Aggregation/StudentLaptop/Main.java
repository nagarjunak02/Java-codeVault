package Oops.Relationships.HasARelationship.Aggregation.StudentLaptop;

public class Main {
    public static void main(String[] args) {
        Laptop l = new Laptop("Dell");
        Student s =new Student("ABC",l);
        s.displayStudent();
    }
}
