package Core.FileHandling.ByteStrean.InputStream.FileInputSream;

import java.io.File;
import java.io.FileInputStream;

public class MethodsReadDemo {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Nagarjuna\\Music\\Java-codeVault\\Level_1_Basic\\src\\Core\\FileHandling\\abc.txt");
//        System.out.println(file);
        FileInputStream input;
        try{

            input = new FileInputStream(file);
//
//            //Read()
            int data ,count =0;
            while ((data= input.read()) != -1){
                System.out.print((char)data);
                count++;
            }
            System.out.println("\n"+count);



        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
