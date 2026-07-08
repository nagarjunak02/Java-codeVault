package Core.Basics.Static.Static_Method;

public class Ex2 {
    int a = 10;
    static void test(){
        Ex2 e = new Ex2();
        System.out.println(e.a = 20);
    }

    public static void main(String[] args) {
        test();
    }
}
