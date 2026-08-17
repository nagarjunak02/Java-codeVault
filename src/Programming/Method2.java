package Programming;

import java.util.Scanner;

public class Method2 {

    public static void main(String[] args) {

        System.out.println("enter value for a: ");
        int a = userInput();

        multi(a);
    }

    private static void multi(int a) {

        for(int i = 1;i<=10;i++){
            System.out.println(a+" * "+i+" = "+a*i);
            //2 * 1 = 2



        }
    }

    public static int userInput(){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        return a;
    }

}
