class Employee{
    int id = 20;
    void showId(){
        System.out.println(id);
    }
}
class Dev extends Employee{
    int id = 220;

    @Override
    void showId() {
        System.out.println(id);
        System.out.println(super.id);
    }
}
public class EmpMain {
    public static void main(String[] args) {
        Employee e = new Dev();
        e.showId();
        System.out.println(e.id);



    }
}

