package Core.Oops.Inheritance.SingleEmployee;

public class Employe {
    static String company;
    int id;

    Employe(String company,int id){
        this.id = id;
        Employe.company = company;
    }

    static {
        System.out.println("Employee Static constructor..");
    }
    {
        System.out.println("Employee non static constructor..");
    }

    void work(){
        System.out.println("Employee "+Employe.company+" has id: "+this.id+" working..");
    }

    static void normes (){
        System.out.println("Employee static method..");
    }
}
