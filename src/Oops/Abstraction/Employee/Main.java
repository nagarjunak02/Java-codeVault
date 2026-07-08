package Oops.Abstraction.Employee;

public class Main {
    public static void main(String[] args) {
        Employee e;
        e = new Developer();
        e.work();

        System.out.println();

        e= new Tester();
        e.work();
    }
}
