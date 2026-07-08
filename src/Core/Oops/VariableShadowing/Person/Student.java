package Core.Oops.VariableShadowing.Person;

public class Student extends person{
    static String name = "Student";

    @Override
    void intro() {
        System.out.println(name);
        System.out.println(super.name);
    }
}
