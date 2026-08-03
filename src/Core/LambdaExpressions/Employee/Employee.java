package Core.LambdaExpressions.Employee;

public class Employee implements Comparable<Employee>{
    private String name;
    private Integer id;
    private Integer age;
    private Double salary;

    Employee(String name,Integer id,Integer age,Double salary){
        this.name = name;
        this.age = age;
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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee [ Name : "+this.name+" ,Id  : "+this.id+" ,Age: "+this.age+" ,Salary : "+this.salary+" ]";
    }

    @Override
    public int compareTo(Employee o) {
        return this.getAge().compareTo(o.getAge());
    }
}
