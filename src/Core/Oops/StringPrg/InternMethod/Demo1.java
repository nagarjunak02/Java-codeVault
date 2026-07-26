package Core.Oops.StringPrg.InternMethod;

public class Demo1 {
    public static void main(String[] args) {
        String s1 = "Java";

//        String s2 = new String("Java");
        String s2 = s1.intern();


        System.out.println(s1==s2);
    }
}
