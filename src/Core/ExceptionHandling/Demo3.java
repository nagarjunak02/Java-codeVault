package Core.ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Demo3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        try{
            int n = sc.nextInt();
            int d = sc.nextInt();

            int q = n/d;
            System.out.println(q);
        } catch (InputMismatchException e) {       // Always place child exception catch blocks before parent exception catch blocks. Otherwise, the parent catch block will handle the exception first.
            System.out.println("Input mismatch exception..");
        }catch (ArithmeticException e){
            System.out.println("Second value mast be Zero..");
        }
    }
}
