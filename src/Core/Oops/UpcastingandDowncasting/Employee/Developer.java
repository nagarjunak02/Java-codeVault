package Core.Oops.UpcastingandDowncasting.Employee;

public class Developer extends Employee{
    String dept;

    public Developer(int id, double sal, String dept) {
        super(id, sal);
        this.dept = dept;
    }

    void displayDeveloper(){
        System.out.println(" Employee id: "+super.id+"\nSalary: "+super.sal+"\nDepartment: "+this.dept);
    }
}
