package Core.FileHandling.ByteStrean.ObjectStream;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectOutputDemo {

    public static void main(String[] args) throws IOException {

        ObjectOutputStream oos =
                new ObjectOutputStream(
                        new FileOutputStream("C:\\Users\\Nagarjuna\\Music\\Java-codeVault\\Level_1_Basic\\src\\Core\\FileHandling\\ObjectStream\\student.dat")
                );

        Student s = new Student(101, "Nagarjuna");

        oos.writeObject(s);

        oos.writeInt(22);
        oos.writeDouble(95.5);
        oos.writeBoolean(true);
        oos.writeUTF("SVIT");
        oos.close();

        System.out.println("Object written successfully");
    }
}