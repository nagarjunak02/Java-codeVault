package Core.Oops.Abstraction.Sample;

public abstract class Sample {
    public abstract void test();

    Sample(){
        System.out.println("Sample constructor..");
    }

    static {
        System.out.println("Sample static blk..");
    }

    {
        System.out.println("sample Non static blk");
    }
}
