package Core.ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Demo4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            int a = sc.nextInt();
            int b = sc.nextInt();

            int q = a/b;
            System.out.println(q);
        }catch (InputMismatchException | ArithmeticException e){    //Here we can speicfy only sibiings we cannot speicfy parent child relationship
            if(e instanceof InputMismatchException){
                System.out.println("Enter valid input");
            }else {
                System.out.println("2nd number must no be zero");
            }
        }
    }
}
