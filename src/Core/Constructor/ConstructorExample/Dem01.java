package Core.Constructor.ConstructorExample;

public class Dem01 {
    Dem01(){
        System.out.println("Demo01 constructor..");
    }

    public static void main(String[] args) {
        System.out.println("Main Started");
        Dem01 d= new Dem01();
        System.out.println("Main Ended");
    }
}
