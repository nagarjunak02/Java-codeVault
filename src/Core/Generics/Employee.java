package Core.Generics;

public class Employee {
    String name;
    int id;

    Employee(String name,int id){
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employee{name='" + name + "', id=" + id + "}";
    }

    static class Room<T>{
        T value;
        public void print(){
            System.out.println("Inside generic class");
        }
        public void setValue(T value){
            this.value = value;
        }
        public T getValue(){
            return value;
        }
    }

    public static void main(String[] args) {
        Employee e = new Employee("A",1);
        Room<Employee> er = new Room<>();
        er.print();
        er.setValue(e);
        System.out.println(er.getValue());

    }

}
