package Core.Basics.WrapperClasses;

public class IntegerCache {
    public static void main(String[] args) {

        //Example 1: Inside cache range (-128 to 127)
        Integer a = 100;
        int pb = 100;
        Integer b = pb;

        System.out.println(a == b);
        System.out.println(a.equals(b));
        System.out.println();

        //Example 2: Outside cache range
        Integer c = 200;
        Integer d  =200;
        System.out.println(c == d);
        System.out.println(c.equals(c));

    }
}


/*
== compares ref
.equals compares value
* */