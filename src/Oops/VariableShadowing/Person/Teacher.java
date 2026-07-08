package Oops.VariableShadowing.Person;

public class Teacher extends person{
    String name = "Teacher";

    @Override
    void intro() {
        System.out.println(name);
        System.out.println(super.name);
    }
}
