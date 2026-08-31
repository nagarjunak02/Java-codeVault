package Core.FileHandling.ByteStrean.OutputStream.BufferedOutputStream;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteDemo {
    public static void main(String[] args) throws IOException {
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("C:\\Users\\Nagarjuna\\Music\\Java-codeVault\\Level_1_Basic\\src\\Core\\FileHandling\\hi.txt"),5);

//        bos.write(65);
//        bos.write(66);
//        bos.write(67);
//        bos.write(68);
//        bos.write(69);
//        bos.write(70);


        byte[] b = {66,66,66,66};
        byte[] b1 = {66,66,66,66};
        byte[] b2 = {66,66,66,66};
        byte[] b3 = {66,66,66,66};
        byte[] b4= {66,66,66,66};

        bos.write(b);
        bos.write(67);
        bos.write(68);
        int a = 68;
        bos.write(a);


//        bos.write(69);
//        bos.write(70);
//        bos.write(b1);
//        bos.write(b2);
//        bos.write(b3);
//        bos.write(b4);
        bos.flush();
    }
}
