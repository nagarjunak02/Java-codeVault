package Core.Basics.WrapperClasses;

public class UnboxingAndAutoboxing {
    public static void main(String[] args) {

        //Manual Unboxing
        Integer obj1 =100;
        int num1 = Integer.valueOf(obj1);
        System.out.println("Wrapper: "+obj1);
        System.out.println("Primitive: "+num1);
        System.out.println();

        //Auto Unboxing
        Integer obj2 = 101;
        int num2 = obj2;
        System.out.println("Wrapper: "+obj2);
        System.out.println("Primitive: "+num2);
    }
}
