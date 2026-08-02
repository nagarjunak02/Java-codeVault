package Core.ComparatorInterface.Employee;

public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee("a",12,122222.0);
        Employee e2 = new Employee("b",1,25000.0);

        EmployeeIdComparator id = new EmployeeIdComparator();
        System.out.println("Comparing by Id");
        System.out.println(id.compare(e1,e2));

        EmployeeNameComparator name = new EmployeeNameComparator();
        System.out.println("Comparing by name");
        System.out.println(name.compare(e1,e2));

        EmployeeSalaryComparator sal = new EmployeeSalaryComparator();
        System.out.println("Comparing by salary");
        System.out.println(sal.compare(e1,e2));

    }
}
