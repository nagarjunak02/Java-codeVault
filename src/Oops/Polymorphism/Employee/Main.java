package Oops.Polymorphism.Employee;

public class Main {
    public static void main(String[] args) {
        Employee e ;
        e = new Developer();
        e.work();    //Runtime Poly(Method ovverriding)
        e.displayEmp();
        System.out.println();

        e = new Tester();
        e.work();
        System.out.println();

        Developer d =  new Developer();
        d.emp("A",23000);
    }
}
