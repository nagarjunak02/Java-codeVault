package Core.Constructor.ConstructorExample;

public class StudentMain {
    public static void main(String[] args) {
        System.out.println("Main");

        //Everything the object is created first non static blk will excute then constructor will exceute
        new Student();
        System.out.println();
        new Student();

        System.out.println("Main-end");

    }
}
