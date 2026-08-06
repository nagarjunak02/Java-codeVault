package Core.CollectionsFramework.LinkedList.Employee;

public class Employee implements Comparable<Employee>{
    private String name;
    private Integer id;
    private Double salary;

    public Employee(Integer id,String name,  Double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee[ Id : "+this.id+" ,Name : "+this.name+" ,Salary: "+this.salary;
    }

    @Override
    public int compareTo(Employee o) {
        return this.getId().compareTo(o.getId());
    }

}
