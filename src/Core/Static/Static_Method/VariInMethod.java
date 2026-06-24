package Core.Static.Static_Method;

import Core.Static.Static_Block.VariInStaticBlk;

public class VariInMethod {
    static int a ;
    int b;

    static void sMethod(){
        System.out.println("Static Method");
        a = 10;

        //To access the instance vari we need to create object
        VariInMethod v = new VariInMethod();
        v.b = 20;
        System.out.println(a);
        System.out.println(v.b);

    }

    public static void main(String[] args) {

        VariInMethod.sMethod();
    }
}
