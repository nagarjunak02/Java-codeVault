package Core.FileHandling.ByteStrean.InputStream.FileInputSream;

import java.io.FileInputStream;


public class SkipDemo {
    public static void main(String[] args) {
        FileInputStream input = null;
        try {
            input = new FileInputStream("C:\\Users\\Nagarjuna\\Music\\Java-codeVault\\Level_1_Basic\\src\\Core\\FileHandling\\abc.txt");
            long skipped = input.skip(3);
            System.out.println(skipped);
            int data;
            System.out.println(input.available());
            while ((data = input.read()) != -1) {
                System.out.print((char) data);

            }
            System.out.println(input.available());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                input.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
