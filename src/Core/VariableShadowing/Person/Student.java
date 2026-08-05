package Core.VariableShadowing.Person;

public class Student extends person{
    static String name = "StudentClass";

    @Override
    void intro() {
        System.out.println(name);
        System.out.println(super.name);
    }
}
