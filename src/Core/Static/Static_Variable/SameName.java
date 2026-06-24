package Core.Static.Static_Variable;

public class SameName {
    static int a = 10;

    public static void main(String[] args) {
        int a = 20;
        System.out.println(a);
        System.out.println(SameName.a);
    }

}
/* Note:
 We can use static variable in non static and static blockes or methods, but to use non static variable inside
 non static and static blocke or method we need to create object
 * */