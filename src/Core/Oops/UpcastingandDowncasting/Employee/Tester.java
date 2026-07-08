package Core.Oops.UpcastingandDowncasting.Employee;

public class Tester extends Employee{
    String dept;

    public Tester(int id, double sal, String dept) {
        super(id, sal);
        this.dept = dept;
    }

    void displayTester(){
        System.out.println(" Employee id: "+super.id+"\nSalary: "+super.sal+"\nDepartment: "+this.dept);
    }
}
