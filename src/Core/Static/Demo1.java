package Core.Static;

public class Demo1 {
    static int x = intValue();

    static {
        System.out.println("Static Blk");
    }

    static int intValue(){
        System.out.println("Static variable");
        return 100;
    }

    public static void main(String[] args) {
        System.out.println("Main");
    }
}
