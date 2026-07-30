package Core.ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Demo05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            int[] x = {23,45,67,89,89,34};
            System.out.println("Enter the index to access the element : ");
            int index = sc.nextInt();

            System.out.println("Enter the divisor: ");
            String s = sc.next();

            int div = Integer.parseInt(s);
            int q = x[index]/div;
            System.out.println(q);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Index not in range");;
        }catch (InputMismatchException e){
            e.printStackTrace();
        }catch (RuntimeException e){
            e.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
