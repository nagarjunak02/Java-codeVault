package Oops.Polymorphism.Employee2;

public class Main {
    public static void main(String[] args) {
        Employee e = new Developer();
        e.work();
        System.out.println();
        e = new Manager();
        e.work();
    }
}
