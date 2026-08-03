package Core.LambdaExpressions.Employee;

import java.util.Arrays;
import java.util.Comparator;

public class Main1 {

    public static void main(String[] args) {

        Comparator<Employee> idc = (e1, e2)-> e1.getId().compareTo(e2.getId()) ;
        Comparator<Employee> namec = (e1, e2)-> e1.getName().compareTo(e2.getName()) ;
        Comparator<Employee> agec = (e1, e2)-> e1.getAge().compareTo(e2.getAge()) ;
        Comparator<Employee> salaryc = (e1, e2)-> e1.getSalary().compareTo(e2.getSalary()) ;

        Employee e1 = new Employee("Ramesh",12,22,122121.0);
        Employee e2 = new Employee("Camesh",1,24,12001.0);
        Employee e3 = new Employee("Pamesh",112,32,1221.0);
        Employee e4 = new Employee("Aamesh",1221,34,12921.0);
        Employee e5 = new Employee("Bamesh",9,20,10001.0);


        Employee[] emp = {e1,e2,e3,e4,e5};
        System.out.println("Before sorting..");
        for(Employee e:emp){
            System.out.println(e);
        }
        System.out.println();

        System.out.println("__________Sorting by ID__________");
        Arrays.sort(emp,idc);
        for(Employee e:emp){
            System.out.println(e);
        }

        System.out.println();
        System.out.println("_________Sorting by Name_________");
        Arrays.sort(emp,namec);
        for(Employee e:emp){
            System.out.println(e);
        }

        System.out.println();
        System.out.println("________Sorting by Age__________");
        Arrays.sort(emp,agec);
        for(Employee e:emp){
            System.out.println(e);
        }

        System.out.println();
        System.out.println("________Sorting by Salary________");
        Arrays.sort(emp,salaryc);
        for(Employee e:emp){
            System.out.println(e);
        }
    }
}
