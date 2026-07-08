//Primitive Windining predefined rule: byte->short->int->long and int->float and from long and foat->

package Core.Oops.OverLoading.MethodOverloading;

public class Dem02 {
    void  display(float a){
        System.out.println("Method-1");
    }

    void  display(long a){
        System.out.println("Method-2");
    }

    public static void main(String[] args) {
        Dem02 d = new Dem02();
        d.display(10); //Method-2
    }
}
