package Core.FileHandling.ByteStrean.OutputStream.FileOutputStream;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class writeDemo {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\Nagarjuna\\Music\\Java-codeVault\\Level_1_Basic\\src\\Core\\FileHandling\\hi.txt");
        FileOutputStream output1 = new FileOutputStream(file);
        output1.write(65);

        byte[] b ={65,66};
        output1.write(b);
//        output1.close();

        FileOutputStream output2 = new FileOutputStream(file,true);
        output2.write(65);

        byte[] c ={65,66};
        output2.write(c);
//        output2.close();

        BufferedOutputStream bos =
                new BufferedOutputStream(output2);

        bos.write("Hello Java".getBytes());
        System.out.println("ji");
        bos.flush();

    }
}
