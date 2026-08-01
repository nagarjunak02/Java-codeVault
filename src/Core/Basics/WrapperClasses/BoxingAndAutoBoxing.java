package Core.Basics.WrapperClasses;

public class BoxingAndAutoBoxing {
    public static void main(String[] args) {
        int num = 100;

        //Manual Boxing
        Integer obj = Integer.valueOf(num);
        System.out.println("Primitive : "+num);
        System.out.println("Wrapper   : "+obj);
        System.out.println();


        //AutoBoxing
        int num1 = 101;
        Integer obj1 = num1;
        System.out.println("Primitive: "+num1);
        System.out.println("Wrapper  : "+obj1);


    }
}
