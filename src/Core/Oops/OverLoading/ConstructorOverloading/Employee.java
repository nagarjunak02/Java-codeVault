package Core.Oops.OverLoading.ConstructorOverloading;

public class Employee {
    String name;
    int id;
    double salary;

    public Employee(){
        System.out.println("Empty constructor");
    }

    Employee(int id){
        this.id = id;
    }

    Employee(int id,String name){
        this.id  = id;
        this.name = name;
    }

    Employee(int id,String name, double salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    void display() {
        System.out.println("Id : " + id);
        System.out.println("Name : " + name);
        System.out.println("Salary : " + salary);
    }
}
