package Core.FileHandling.ByteStrean;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputDemo {
    public static void main(String[] args) {
        FileInputStream input = null;
        try {
            input = new FileInputStream("C:\\Users\\Nagarjuna\\Music\\Java-codeVault\\Level_1_Basic\\src\\Core\\FileHandling\\abc.txt");
            int data;

            while ((data = input.read()) != -1) {
                System.out.print((char) data);
            }
        } catch (IOException e) {
            e.getMessage();
        } finally {
            if (input != null) {
                try {
                    input.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
