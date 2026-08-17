package Core.Basics.Blocks.nonstatic;

public class Demo2 {
    static {
        System.out.println("Demo2 static blk..");
    }

    {
        System.out.println("demo2 non static blk..");
    }
}
