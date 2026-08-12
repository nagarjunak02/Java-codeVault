package Programming;

import java.util.Scanner;

public class SpecialTwoDigitP2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");

        int n = sc.nextInt();
        int m = n;

        int lastdig = n%10;
        int firstdig = n/10;

        int sum = lastdig+firstdig + lastdig* firstdig;
        if(sum == m) System.out.println("Special no.");
        else System.out.println("Special no.");

    }
}
