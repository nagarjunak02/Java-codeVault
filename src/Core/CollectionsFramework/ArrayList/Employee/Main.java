package Core.CollectionsFramework.ArrayList.Employee;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Employee> ae = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        boolean loop = true;

        System.out.println("************* Welcome ***********");
        while (loop){

            System.out.println("Enter choice: \n1.Add employee\n2.Delete by id Employee\n3.Sort employee by Id\n4.Sort employee by Salary\n5.Exit");

            int c = sc.nextInt();

            switch (c){
                case 1:
                    System.out.println("Enter Employee name,id and salary");

                    try {
                        sc.nextLine();
                        String name = sc.nextLine();
                        int id = sc.nextInt();
                        double salary = sc.nextDouble();
                        Employee e = new Employee(name,id,salary);
                        ae.add(e);
                        System.out.println("Employee added successfully");
                    }catch (InputMismatchException e){
                        System.out.println("Enter valid input");
                    }

                    break;
                case 2:
                    System.out.println("Enter employee id you want to delete: ");
                    try{
                        int idd = sc.nextInt();
                        boolean found = false;
                        Iterator<Employee> it = ae.iterator();
                        while (it.hasNext()){
                            Employee e = it.next();
                            if(e.getId() == idd){
                                it.remove();
                                found = true;
                                System.out.println("Employee with "+idd+" has deleted...");
                                break;

                            }
                        }
                        if(!found){
                            System.out.println("employee with "+idd+" not found..");
                        }
                    }catch (InputMismatchException e){
                        System.out.println("Invalid input..");
                    }
                    break;
                case 3:
//                    Comparator<Employee> eic =new Comparator<Employee>() {
//                        @Override
//                        public int compare(Employee o1, Employee o2) {
//                            return o1.getId().compareTo(o2.getId());
//                        }
//                    };

                    Collections.sort(ae, (e1,e2)->e1.getId().compareTo(e2.getId()));
                    System.out.println(ae);
                    break;
                case 4:
                    Comparator<Employee> esc = new Comparator<Employee>() {
                        @Override
                        public int compare(Employee o1, Employee o2) {
                            return o1.getSal().compareTo(o2.getSal());
                        }
                    } ;
                    Collections.sort(ae,esc);
                    System.out.println(ae);
                    break;
                case 5:
                    loop = false;
                    break;
                default:
                    System.out.println("Enter valid choice");
            }
            System.out.println("\n_______________thank you___________________");
        }
    }
}
