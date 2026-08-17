package Core.Basics.Blocks.nonstatic;

public class demo1 {
    static {
        System.out.println("static blk..");
    }
    int a = 10;
    static int c;
    {
        System.out.println("non static blk..");
        System.out.println(a);

        int b = 20;
        System.out.println(b);

        c = 10;

    }

    void display(){
        System.out.println("display method..");
    }

    public static void main(String[] args) {
        demo1 d  =new demo1();
        d.display();

        Demo2 d2 = new Demo2();
        Demo2 d3 = new Demo2();
        demo1 d4 = new demo1();

    }
}
