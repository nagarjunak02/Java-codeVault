package Core.Oops.Inheritance.MultiPerson;

public class Manger extends Employee{
    String dept;
    Manger(String name, int age, int empId, double salary,String dept) {
        super(name, age, empId, salary);
        this.dept = dept;
    }

    static {
        System.out.println("Manager SB");
    }
    {
        System.out.println("Mangaer NSB");
    }

    void displayManger(){
        System.out.println("Departmenet: "+this.dept);
    }
}
