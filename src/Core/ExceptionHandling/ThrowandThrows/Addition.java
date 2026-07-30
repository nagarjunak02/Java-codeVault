package Core.ExceptionHandling.ThrowandThrows;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Addition {
    public static void main(String[] args) {
        try{
            plus("1","1");
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            System.err.println("Program executed finally");
        }
    }

    static void plus(String number, String s) throws Exception{
        int a = Integer.parseInt(number);
        int b = Integer.parseInt(s);

        sum(a,b);

    }

    static void sum(int a, int b) throws FileNotFoundException{
        if(a == 0){
            throw new FileNotFoundException("First value is zero");
        }
        add(a,b);
    }

    static void add(int a, int b) {
        if(b == 0){
            try {
                throw new IOException("Second value is zero");
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }else{
            System.out.println("A+b: "+(a+b));
        }
    }


}
