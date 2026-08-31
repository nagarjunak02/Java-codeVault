package Core.FileHandling.ByteStrean.InputStream.DataInputStream;


import java.io.*;

public class DataStreamDemo {

    public static void main(String[] args) throws IOException {

        /*
         * =====================================================
         * STEP 1: WRITE DATA
         * =====================================================
         *
         * DataOutputStream allows us to write Java primitive
         * data types directly.
         *
         * Java
         *   ↓
         * DataOutputStream
         *   ↓
         * FileOutputStream
         *   ↓
         * data.dat
         */

        DataOutputStream dos =
                new DataOutputStream(
                        new FileOutputStream("C:\\Users\\Nagarjuna\\Music\\Java-codeVault\\Level_1_Basic\\src\\Core\\FileHandling\\hi.txt")
                );

        dos.writeInt(25);
        dos.writeDouble(95.5);
        dos.writeBoolean(true);
        dos.writeChar('A');
        dos.writeLong(100000L);

        dos.close();


        /*
         * =====================================================
         * STEP 2: READ DATA
         * =====================================================
         *
         * DataInputStream reads the same data types.
         *
         * data.dat
         *   ↓
         * FileInputStream
         *   ↓
         * DataInputStream
         *   ↓
         * Java primitive values
         */

        DataInputStream dis =
                new DataInputStream(
                        new FileInputStream("C:\\Users\\Nagarjuna\\Music\\Java-codeVault\\Level_1_Basic\\src\\Core\\FileHandling\\hi.txt")
                );

        int age = dis.readInt();
        double marks = dis.readDouble();
        boolean passed = dis.readBoolean();
        char grade = dis.readChar();
        long number = dis.readLong();

        dis.close();


        /*
         * =====================================================
         * STEP 3: PRINT DATA
         * =====================================================
         */

        System.out.println("Age     : " + age);
        System.out.println("Marks   : " + marks);
        System.out.println("Passed  : " + passed);
        System.out.println("Grade   : " + grade);
        System.out.println("Number  : " + number);
    }
}