package Programming;

import java.util.Scanner;

public class Method1 {
    public static void main(String[] args) {

        System.out.println("Enter value for a: ");
        int a = userInput();

        System.out.println("Enter value for b: ");
        int b  =userInput();

        add(a,b);


    }

    public  static int userInput(){
        Scanner sc = new Scanner(System.in);
        int ab = sc.nextInt();
        return ab;
    }
    public static void add(int a, int b){
        System.out.println(a+b);
    }
}
