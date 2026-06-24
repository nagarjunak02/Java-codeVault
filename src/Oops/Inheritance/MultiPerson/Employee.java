package Oops.Inheritance.MultiPerson;

public class Employee  extends Person {
    int empId;
    double salary;

    Employee(String name, int age,int empId,double salary) {
        super(name, age);
        this.empId = empId;
        this.salary = salary;
    }

    static {
        System.out.println("Employee SB");
    }
    {
        System.out.println("Employe NSB");
    }

    void displayEmp(){
        System.out.println("EMP id: "+this.empId+" Salary: "+this.salary);
    }
}
