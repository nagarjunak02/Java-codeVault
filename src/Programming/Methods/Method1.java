package Programming.Methods;

import java.util.Scanner;

public class Method1 {
    public static void main(String[] args) {

        Scanner sv = new Scanner(System.in);
        int a = sv.nextInt();
        double b = sv.nextInt();

        operationMethod(a,b);
        greet();


    }

    public static void operationMethod(int a,double b){
        System.out.println("add a and b: "+a+b);
        System.out.println("Sub a and b: "+(a-b));
}
    public static void greet(){
        System.out.println("Hello");
    }


//        int addRes = add(a,b);   //Method calling statment here a and b are actual paramets
//        System.out.println("Added a and b: "+addRes);
//
//        int subRes = sub(a,b);
//        System.out.println("Sub a and b: "+subRes);
//    }
//
//    public static int add(int x, int y){   //Method decalracrion and called method  x and y are formal parameters
//        return x+y;
//    }
//
//    public static int sub(int x,int y){
//        return x-y;
//    }


}
