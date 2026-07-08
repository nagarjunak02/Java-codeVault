package Oops.VariableShadowing.Person;

public class Main {
    public static void main(String[] args) {
        person p = new Student();
        System.out.println(p.name);
        p.intro();

        System.out.println();

        p = new Teacher();
        System.out.println(p.name);
        p.intro();
    }
}
