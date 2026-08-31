package Core.FileHandling.ByteStrean.OutputStream.BufferedOutputStream;

import java.io.*;

public class BOSDemo {

    public static void main(String[] args) throws IOException {

        File file = new File("C:\\Users\\Nagarjuna\\Music\\Java-codeVault\\Level_1_Basic\\src\\Core\\FileHandling\\hi.txt");


        /*
         * =====================================================
         * CREATING STREAMS
         * =====================================================
         *
         * File
         *  ↓
         * FileOutputStream
         *  ↓
         * BufferedOutputStream
         *  ↓
         * Java Program
         *
         * FileOutputStream knows how to write to the file.
         * BufferedOutputStream adds an internal buffer.
         */

        FileOutputStream fos = new FileOutputStream(file);

        BufferedOutputStream bos =
                new BufferedOutputStream(fos);


        /*
         * =====================================================
         * 1. write(int b)
         * =====================================================
         *
         * Writes ONE BYTE.
         *
         * 65 represents 'A'.
         *
         * The byte is initially placed in the internal
         * BufferedOutputStream buffer.
         */

        bos.write(65);

        /*
         * Internal buffer conceptually:
         *
         * [ A ][ ][ ][ ][ ][ ] ...
         *
         * 65 → A
         */


        /*
         * =====================================================
         * 2. write(byte[] b)
         * =====================================================
         *
         * Writes the entire byte array.
         */

        byte[] data = {66, 67, 68};

        bos.write(data);

        /*
         * Buffer conceptually:
         *
         * [ A ][ B ][ C ][ D ][ ][ ] ...
         *
         * 65 → A
         * 66 → B
         * 67 → C
         * 68 → D
         *
         * At this point the data can still be inside
         * the BufferedOutputStream's internal buffer.
         */


        /*
         * =====================================================
         * 3. write(byte[] b, int off, int len)
         * =====================================================
         *
         * Writes only PART of a byte array.
         *
         * off → starting index
         * len → number of bytes to write
         */

        byte[] data2 = {69, 70, 71, 72, 73};

        bos.write(data2, 1, 3);

        /*
         * data2:
         *
         * Index:   0    1    2    3    4
         *         [E]  [F]  [G]  [H]  [I]
         *                └────────────┘
         *                   3 bytes
         *
         * off = 1
         * len = 3
         *
         * Therefore:
         *
         * F
         * G
         * H
         *
         * are written.
         *
         * Buffer now conceptually contains:
         *
         * [A][B][C][D][F][G][H]
         */


        /*
         * =====================================================
         * 4. flush()
         * =====================================================
         *
         * Forces the buffered data to be passed to the
         * underlying FileOutputStream.
         *
         * Flow:
         *
         *     BOS internal buffer
         *             ↓
         *          flush()
         *             ↓
         *     FileOutputStream
         *             ↓
         *           File
         */

        bos.flush();

        System.out.println("Data flushed to file");


        /*
         * IMPORTANT:
         *
         * flush() DOES NOT close the stream.
         *
         * We can continue writing after flush().
         */

        bos.write(" Java".getBytes());

        bos.flush();


        /*
         * =====================================================
         * 5. close()
         * =====================================================
         *
         * Closes the BufferedOutputStream.
         *
         * It also performs the necessary final flushing.
         *
         * It also closes the underlying FileOutputStream.
         */

        bos.close();

        System.out.println("Stream closed");


        /*
         * =====================================================
         * FINAL FILE CONTENT
         * =====================================================
         *
         * First:
         *
         * write(65)
         *      ↓
         *      A
         *
         * write({66,67,68})
         *      ↓
         *      BCD
         *
         * write(data2, 1, 3)
         *      ↓
         *      FGH
         *
         * Then:
         *
         * write(" Java")
         *
         *      ↓
         *      " Java"
         *
         *
         * Final file:
         *
         *     ABCDFGH Java
         *
         *
         * Console output:
         *
         *     Data flushed to file
         *     Stream closed
         *
         * =====================================================
         */
    }
}