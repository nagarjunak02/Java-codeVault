package Oops.Polymorphism.Employee2;

public class Developer extends Employee{
    @Override
    void work() {
        super.work();
        System.out.println("Developer working..");
    }
}
