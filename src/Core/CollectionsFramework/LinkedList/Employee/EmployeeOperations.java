package Core.CollectionsFramework.LinkedList.Employee;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class EmployeeOperations {
    LinkedList<Employee> emp= new LinkedList<>();

    public void addEmp(Integer id, String name,Double salary){
        Employee e = new Employee(id,name,salary);
        emp.add(e);
        System.out.println("Employee added successfully....");
        System.out.println("____________________________________________\n");
    }

    public void displayEmp(){
        System.out.println();
        for(Employee e:emp){
            System.out.println(e);
        }
        System.out.println("_________________Display sucsess____________________________\n");
    }

    public void sortById(){
        Collections.sort(emp);
        for(Employee e:emp){
            System.out.println(e);
        }
        System.out.println("________________Sort by id success_____________________________\n");
    }

    public void sortBySal(){
        Collections.sort(emp,(e1,e2)->e1.getSalary().compareTo(e2.getSalary()));
        for(Employee e:emp){
            System.out.println(e);
        }
        System.out.println("___________________sort by sal success__________________________\n");
    }
    public void searchById(int id){
        boolean found = false;
        for (Employee e:emp){
            if(e.getId() == id){
                found = true;
                System.out.println(e);
            }
        }
        if(found){
            System.out.println("________________search by id success_____________________________\n");
        }else{
            System.out.println("Employee not found in list\n");
        }

    }

    public void deleteById(int id){
        for(Employee e : emp){
            if(e.getId() == id){
                emp.remove(e);
                System.out.println("____________________employee delete success_________________________\n");
                return;

            }
        }
        System.out.println("Employee with "+id+" not found..");
    }

    public void updateSal(int id,double sal){
        for (Employee e:emp){
            if(e.getId() == id){
                e.setSalary(sal);
            }
        }
        System.out.println("_____________________salary updated________________________\n");
    }

    public void diplayByIt(){
        Iterator<Employee> it = emp.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("____________________displayed_________________________\n");
    }

    public void displayForward(){
        ListIterator<Employee> li= emp.listIterator();
        while (li.hasNext()){

            System.out.println(li.next());
        }
        System.out.println("_____________________displayed in proper order________________________\n");
    }

    public void displayBackward(){
        ListIterator<Employee> li = emp.listIterator(emp.size());
        while (li.hasPrevious()){
            System.out.println(li.previous());
        }
        System.out.println("_______________displayed in reverse_______________________________\n");
    }
}
