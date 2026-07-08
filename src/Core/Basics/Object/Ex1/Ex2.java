package Core.Basics.Object.Ex1;

public class Ex2 {
    int i;

    public static void main(String[] args) {
        Ex2 e1 = new Ex2();
        Ex2 e2 = new Ex2();
        Ex2 e3 = null;

        e2.i = 10;
        System.out.println(e2.i);
        System.out.println(e1.i);
        System.out.println(e3.i);//NullPointerException
    }
}
