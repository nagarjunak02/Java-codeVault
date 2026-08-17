package Core.Basics.Blocks;

public class Demo1 { //global scope
    int a;
    static String name;
    static {
        Demo1 d = new Demo1();
        d.a = 20;
        name  ="aaba";
        System.out.println("static blk from demo1");

        String cllg = "svit";
        System.out.println(cllg);
    }

    public static void main(String[] args) { //local scope

        System.out.println("Hi");
        Demo d1 = new Demo();


        Demo d2 = new Demo();
    }
}
