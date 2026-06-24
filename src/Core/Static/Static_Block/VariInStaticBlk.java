package Core.Static.Static_Block;

public class VariInStaticBlk {
    int a;
    public static int b;
    static {
        VariInStaticBlk i = new VariInStaticBlk();
        i.a = 10;
        b = 20;
        System.out.println();
        System.out.println("Static blk started..");
        System.out.println(i.a);
        System.out.println(b);
        System.out.println("Static blk ended..");
        System.out.println();

    }
    {
        System.out.println("non Static blk started..");
        a = 10;
        b = 20;
        System.out.println(a);
        System.out.println(b);
        System.out.println("non static blk ended");
        System.out.println();
    }

    public static void main(String[] args) {

        System.out.println("Main Started");
//        new VariInStaticBlk();
        System.out.println("Main Ended");

    }
}


/* Execution order:
* Class Loading Starts
    ↓
Static Block Starts
    ↓
new VariInStaticBlk()
    ↓
Non-Static Block Starts
    ↓
Non-Static Block Ends
    ↓
Object Creation Complete
    ↓
Continue Static Block
    ↓
Static Block Ends
    ↓
main()*/