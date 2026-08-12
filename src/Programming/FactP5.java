package Programming;

import java.util.Scanner;

public class FactP5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

//        int i =2;
        int fact = 1;
        while (n>1){
            fact = fact * n;
            n--;
        }
        System.out.println(fact);
    }
}
