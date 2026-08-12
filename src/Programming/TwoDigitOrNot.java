package Programming;

import java.util.Scanner;

public class TwoDigitOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n > 9 && n<100) System.out.println("two digit");
        else System.out.println("not");
    }
}
