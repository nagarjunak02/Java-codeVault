package Oops.Polymorphism.Employee2;

public class Manager extends Developer{
    @Override
    void work() {
        super.work();
        System.out.println("Manager managing the works..");
    }
}
