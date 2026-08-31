package Core.FileHandling.ByteStrean.ObjectStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectInputDemo {

    public static void main(String[] args)
            throws IOException, ClassNotFoundException {


        /*
         * ======================================================
         * STEP 1: Create ObjectInputStream
         * ======================================================
         *
         * The file should already contain serialized data.
         *
         * File
         *   ↓
         * FileInputStream
         *   ↓
         * ObjectInputStream
         *   ↓
         * Java Object / Data
         */

        ObjectInputStream ois =
                new ObjectInputStream(
                        new FileInputStream("C:\\Users\\Nagarjuna\\Music\\Java-codeVault\\Level_1_Basic\\src\\Core\\FileHandling\\ObjectStream\\student.dat")
                );


        /*
         * ======================================================
         * 1. readObject()
         * ======================================================
         *
         * Reads a serialized object and reconstructs it.
         *
         * readObject() returns Object.
         *
         * Therefore we cast it to Student.
         */

        Student s = (Student) ois.readObject();

        System.out.println("Object:");
        System.out.println(s);


        /*
         * INTERNAL WORKING:
         *
         * student.dat
         *      ↓
         * serialized bytes
         *      ↓
         * ObjectInputStream
         *      ↓
         * deserialization
         *      ↓
         * Student object created/reconstructed in HEAP
         *      ↓
         * reference returned
         *      ↓
         * s
         */


        /*
         * ======================================================
         * 2. readInt()
         * ======================================================
         *
         * Reads an int that was previously written using
         * ObjectOutputStream.writeInt().
         */

        int age = ois.readInt();

        System.out.println("Age: " + age);


        /*
         * INTERNAL WORKING:
         *
         * File
         *   ↓
         * binary representation of int
         *   ↓
         * readInt()
         *   ↓
         * Java int
         */


        /*
         * ======================================================
         * 3. readDouble()
         * ======================================================
         *
         * Reads a double that was previously written using
         * writeDouble().
         */

        double marks = ois.readDouble();

        System.out.println("Marks: " + marks);


        /*
         * ======================================================
         * 4. readBoolean()
         * ======================================================
         *
         * Reads a boolean value.
         */

        boolean passed = ois.readBoolean();

        System.out.println("Passed: " + passed);


        /*
         * ======================================================
         * 5. readUTF()
         * ======================================================
         *
         * Reads a String that was previously written using
         * writeUTF().
         */

        String college = ois.readUTF();

        System.out.println("College: " + college);


        /*
         * ======================================================
         * 6. read()
         * ======================================================
         *
         * Reads ONE BYTE.
         *
         * Returns:
         *
         *     0 - 255  → byte value
         *     -1        → end of stream
         *
         * NOTE:
         *
         * If the next data in the stream was written using
         * a structured ObjectOutputStream/DataOutputStream
         * method, using read() blindly is generally not how
         * you should interpret that data.
         *
         * It is shown here because ObjectInputStream inherits
         * the basic InputStream read API.
         */


        /*
         * int data = ois.read();
         *
         * System.out.println("Byte: " + data);
         */


        /*
         * ======================================================
         * 7. available()
         * ======================================================
         *
         * Returns an estimate of the number of bytes that can
         * be read without blocking.
         *
         * It does NOT mean:
         *
         *     "number of objects remaining"
         *
         * It is a byte-oriented InputStream concept.
         */

        int available = ois.available();

        System.out.println("Available bytes: " + available);


        /*
         * ======================================================
         * 8. skipBytes(int n)
         * ======================================================
         *
         * Skips n bytes in the input stream.
         *
         * IMPORTANT:
         *
         * Don't use this to randomly skip parts of an
         * ObjectInputStream serialization format unless you
         * know exactly what you're doing.
         *
         * It is mainly useful when you intentionally know
         * the byte structure you are working with.
         */

        // int skipped = ois.skipBytes(2);
        // System.out.println("Skipped: " + skipped);


        /*
         * ======================================================
         * 9. close()
         * ======================================================
         *
         * Closes ObjectInputStream.
         *
         * It also closes the underlying FileInputStream.
         */

        ois.close();

        System.out.println("Stream closed.");
    }
}