package Core.Static.Static_Variable;

public class Demo1 {
    String name = "A";
    static String collage = "sjbit";

    public static void main(String[] args) {
        Demo1 d = new Demo1();
//        d.name = "ABC";
        Demo1.collage = "SVIT";
        System.out.println(d.name);
        System.out.println(Demo1.collage);

    }
}
