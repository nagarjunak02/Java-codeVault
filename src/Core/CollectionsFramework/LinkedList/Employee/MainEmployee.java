package Core.CollectionsFramework.LinkedList.Employee;

import java.util.LinkedList;
import java.util.Scanner;

public class MainEmployee {
    public static void main(String[] args) {

//        Employee e1 = new Employee(101, "Nagarjuna", 65000.0);
//        Employee e2 = new Employee(105, "Rahul", 55000.0);
//        Employee e3 = new Employee(103, "Ananya", 72000.0);
//        Employee e4 = new Employee(102, "Vikram", 48000.0);
//        Employee e5 = new Employee(104, "Sneha", 60000.0);
//
//        LinkedList<Employee> employees = new LinkedList<>();
//
//        employees.add(e1);
//        employees.add(e2);
//        employees.add(e3);
//        employees.add(e4);
//        employees.add(e5);
//
//        System.out.println(employees);

        EmployeeOperations eo = new EmployeeOperations();

        Scanner sc = new Scanner(System.in);

        boolean loop = true;

        while (loop){
            System.out.println("Enter you choice" +
                    "1. Add Employee\n" +
                    "2. Display Employees\n" +
                    "3. Sort by ID (Comparable)\n" +
                    "4. Sort by Salary (Comparator)\n" +
                    "5. Search Employee by ID\n" +
                    "6. Delete Employee by ID\n" +
                    "7. Update Salary\n" +
                    "8. Display using Iterator\n" +
                    "9. Display using ListIterator (Forward)\n" +
                    "10. Display using ListIterator (Backward)\n" +
                    "11. Exit");
            System.out.println();
            int choice = sc.nextInt();

            switch (choice){
                case 1:

                    System.out.println("Enter Id,Name and Salary : ");
                    int id = sc.nextInt();
                    String name = sc.next();
                    Double sal = sc.nextDouble();

                    eo.addEmp(id,name,sal);
                    break;


                case 2:
                    System.out.println("Employee Details..");
                    eo.displayEmp();
                    System.out.println();
                    break;

                case 3:
                    System.out.println("Sorting by id:");
                    eo.sortById();
                    System.out.println();
                    break;


                case 4:
                    System.out.println("Sorting by salary: ");
                    eo.sortBySal();
                    break;


                case 5:
                    System.out.println("Enter the id you want to search: ");
                    int ids = sc.nextInt();
                    eo.searchById(ids);
                    break;

                case 6:
                    System.out.println("Enter the id you want to delete");
                    int idd = sc.nextInt();
                    eo.deleteById(idd);
                    break;

                case 7:
                    System.out.println("Enter the id and salary you want to update: ");
                    int idsal = sc.nextInt();
                    double salupdate = sc.nextDouble();
                    eo.updateSal(idsal,salupdate);
                    break;

                case 8:
                    eo.diplayByIt();
                    break;

                case 9:
                    eo.displayForward();
                    break;
                case 10:
                    eo.displayBackward();
                    break;
                case 11:
                    loop = false;
                    break;
                default:
                    System.out.println("invalid choice..");
            }
        }


    }
}
