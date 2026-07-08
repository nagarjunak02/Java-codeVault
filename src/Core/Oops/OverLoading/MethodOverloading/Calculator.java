package Core.Oops.OverLoading.MethodOverloading;

public class Calculator {

    static void add(int a, int b){
        System.out.println(a+b);
    }
    static void add(int a, int b,int c){
        System.out.println(a+b+c);
    }

    static void add(int a, double b){
        System.out.println(a+b);
    }

    static void add(double a, int b){
        System.out.println(a+b);
    }

    public static void main(String[] args) {
        Calculator c = new Calculator();
        c.add(10.0,12);
        Calculator.add(10,20);
        Calculator.add(10,20.2);
    }

}
