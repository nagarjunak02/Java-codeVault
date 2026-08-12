package Programming;

import java.util.Scanner;

public class EvenOddP3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  n = sc.nextInt();

//        if(n%2 == 0) System.out.println("Even");
//        else System.out.println("Odd");

//        if((n&1)==0) System.out.println("even");
//        else System.out.println("odd");;

        String[] st = {"Even","Odd"};


        System.out.println(st[n%2]);
    }
}
