package Core.Oops.MethodOverriding.Employee;

public class Main {
    public static void main(String[] args) {
        Employe e = new Developer(); //upcasting
        e.work(); //Dynamic Method dispatch

        e = new Tester();
        e.work();


    }
}
