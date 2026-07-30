package Core.ExceptionHandling;

import java.util.Scanner;

public class Demo6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            int[] x = {23,45,67,89,0,34};
            System.out.println("Enter the value : ");
            int value = sc.nextInt();

            for (int i  =0 ; i< x.length;i++){
                int q = value/x[i];
                System.out.println(q);
            }
        }finally {
            System.out.println("I am finally executed...");
        }

        System.out.println("Thank you..");
    }
}

// finally always executes.
// finally is used for cleanup.
// finally does not handle exceptions.
// Unhandled exception -> finally executes -> JVM terminates program.
// Code after try-finally executes only if exception is handled.