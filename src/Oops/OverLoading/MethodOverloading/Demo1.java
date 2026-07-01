//java: reference to display is ambiguous

package Oops.OverLoading.MethodOverloading;

public class Demo1 {
    void display(int a, double b){
        System.out.println("Method-1");
    }
    void display(double a, int b){
        System.out.println("Method-2");
    }

    public static void main(String[] args) {
        Demo1 d = new Demo1();
//        d.display(10,20);

    }
}
