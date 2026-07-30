package Core.ExceptionHandling;

import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter the 1st value: ");
            int n = sc.nextInt();

            System.out.println("Enter the 2nd value: ");
            int d = sc.nextInt();

            int q = n/d;
            System.out.println(q);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
