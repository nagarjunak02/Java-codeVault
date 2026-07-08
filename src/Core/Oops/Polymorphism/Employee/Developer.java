package Core.Oops.Polymorphism.Employee;

public class Developer extends Employee{
    @Override
    void work(){
        System.out.println("Developer working..");
    }

    void emp(){
        System.out.println("Emp");
    }

    void emp(String name){
        System.out.println("Emp: "+name);
    }

    void emp(String name,double sal){
        System.out.println("Emp: "+name+" sal : "+sal);
    }
}
