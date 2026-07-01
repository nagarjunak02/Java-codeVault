package Oops.UpcastingandDowncasting.Employee;

public class Main {
    public static void main(String[] args) {
        Employee e;
        e = new Developer(1,30000,"Developer");
        Developer d = (Developer) e;
        d.displayDeveloper();
        System.out.println();

        e = new Tester(2,350000,"Testing");
//        Tester t = (Tester) e;
        ((Tester) e).displayTester();
//        ((Tester) e).displayTester();
    }
}
