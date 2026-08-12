package Programming;

import java.util.Scanner;

public class Numbers {
    static Scanner sc = new Scanner(System.in);
    public static int userInput(){
        int n = sc.nextInt();
        return n;
    }

    public static void isPerfect(int n){
        int sum = 0;

        for (int i = 1; i<=n/2;i++){
            if(n%i == 0){
                sum = sum+i;
            }
        }
        if(sum == n) System.out.println("perfect");
        else System.out.println("not perfect");
    }

    public static boolean isPrime(int n ){
        if(n<=1) System.out.println("not prime");

        for (int i = 2; i<=n/2;i++){
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int reverse(int n ){
        int num = 0;
        while (n!=0){
            num = num*10+ (n %10);
            n = n/10;
        }
        return num;
    }

    public static boolean isStrong(int n){
//        145 = 1!+4!+5! = 145
        int sum = 0;
        int m = n;
        while (n!=0){
            int fact = getFact(n%10);
            sum = sum+fact;
            n = n/10;
        }return sum == m;
    }

    private static int getFact(int i) {
        int fact = 1;
        while (i>1){
            fact = fact*i;
            i--;
        }
    return fact;
    }



    private static boolean isArmStong(int n) {
        int c = countDigit(n);
        int m = n;
        int sum  =0;
        while (m!=0){
            sum =  sum+ getProd(m%10,c);
            m = m/10;
        }

        return sum == n;
    }

    private static int getProd(int i, int c) {
        int prod = 1;
        while (c>0){
            prod = prod*i;
            c--;
        }
        return prod;
    }

    private static int countDigit(int n) {
        int count = 0;
        while (n!=0){
            n = n/10;
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        int n = userInput();
        isPerfect(n);

        boolean res = isPrime(n);
        System.out.println(res);

        int rev = reverse(n);
        System.out.println(rev);

        System.out.println(isStrong(n));

        System.out.println(isArmStong(n));

        System.out.println(isDiserium(n));

    }

    private static boolean isDiserium(int n) {
        int c = countDigit(n);
        int m = n;
        int sum  = 0;
        while (n!=0){
            sum = sum+ getProd(n%10,c);
            c--;
            n = n/10;
        }
        return sum == m;
    }
}
