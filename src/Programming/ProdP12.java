package Programming;

import java.util.Scanner;

public class ProdP12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p =sc.nextInt();
        int res = getPow(n,p);
        System.out.println(res);
    }

    private static int getPow(int n, int p) {
        int prod = 1;
        while (p>0){
            prod = prod * n;
            p--;
        }
        return prod;
    }
}
