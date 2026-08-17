package Programming.Methods;

import Programming.Method2;

public class Method3 {

    public static void main(String[] args){

        System.out.println("enter a value");

        int a = Method2.userInput();

        checkEO(a);


    }
    public static void checkEO(int n) {
        if (n % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }
}
