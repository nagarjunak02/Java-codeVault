package Programming.Methods;

import Programming.Method2;

import java.sql.SQLOutput;

public class Method4 {

    public static void main(String[] args) {


        int a = Method2.userInput();
        int b = Method2.userInput();
        int multi = multi(a,b);
        System.out.println(multi);
    }

        public static int multi ( int a, int b){

            int c = a * b;
            return c;
        }
    }

