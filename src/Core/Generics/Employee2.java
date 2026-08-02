package Core.Generics;

public class Employee2 {
    String name;
    int id;

    Employee2(String name,int id){
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employee{name='" + name + "', id=" + id + "}";
    }

    static class Room<K,V>{
        K value1;
        V value2;
        public void print(){
            System.out.println("Inside generic class");
        }
        public void setValue1(K value1){
            this.value1 = value1;
        }
        public K getValue1(){
            return value1;
        }

        public void setValue2(V value2){
            this.value2 = value2;
        }

        public V getValue2() {
            return value2;
        }
    }

    public static void main(String[] args) {
        Employee2 e1 = new Employee2("A",1);
        Room<Integer,String> er = new Room<>();
        er.setValue1(e1.id);
        er.setValue2(e1.name);
        System.out.println(er.getValue1());
        System.out.println(er.getValue2());


    }

}
