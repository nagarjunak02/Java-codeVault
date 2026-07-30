package Core.ExceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo8 {
    public static void main(String[] args) {
        FileInputStream fin = null;
        try {
            fin = new FileInputStream("src/Core/ExceptionHandlinasdg/Dem01.java");
            int ch = fin.read();

            while (ch != 1){
                System.out.println((char) ch);
                ch = fin.read();
            }
        }
        catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
        finally {
            try {
                fin.close();
            }catch (IOException | NullPointerException e){
                System.out.println(e.getMessage());
            }
        }
        System.out.println("Thank you");
    }
}
