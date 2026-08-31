package Core.FileHandling.ByteStrean.OutputStream.FileOutputStream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\Nagarjuna\\Music\\Java-codeVault\\Level_1_Basic\\src\\Core\\FileHandling\\hi.txt");
        FileOutputStream output1 = new FileOutputStream(file);
        output1.write("Heloo".getBytes());
    }
}
