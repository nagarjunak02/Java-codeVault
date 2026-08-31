package Core.FileHandling.ByteStrean.InputStream.BufferedInputStrea;


import java.io.*;

public class BISDemo {

    public static void main(String[] args) throws IOException {

        File file = new File("C:\\Users\\Nagarjuna\\Music\\Java-codeVault\\Level_1_Basic\\src\\Core\\FileHandling\\abc.txt");

        /*
         * =====================================================
         * Creating BufferedInputStream
         * =====================================================
         *
         * File
         *  ↓
         * FileInputStream
         *  ↓
         * BufferedInputStream
         *  ↓
         * Java Program
         *
         * FileInputStream knows HOW to read from the file.
         * BufferedInputStream adds an internal buffer.
         */

        FileInputStream fis = new FileInputStream(file);

        BufferedInputStream bis =
                new BufferedInputStream(fis);


        /*
         * =====================================================
         * 1. read()
         * =====================================================
         *
         * Reads ONE byte.
         *
         * BIS first checks its internal buffer.
         *
         * If buffer has data:
         *      → takes byte from buffer
         *
         * If buffer is empty:
         *      → gets a chunk from FileInputStream
         *      → stores it in internal buffer
         *      → returns the required byte
         */

        int data = bis.read();

        System.out.println("read(): " + (char) data);


        /*
         * =====================================================
         * 2. read(byte[] b)
         * =====================================================
         *
         * Reads bytes into a byte array.
         *
         * It can read up to b.length bytes.
         */

        byte[] buffer = new byte[5];

        int count = bis.read(buffer);

        System.out.println("Bytes read: " + count);

        for (int i = 0; i < count; i++) {
            System.out.print((char) buffer[i]);
        }

        System.out.println();


        /*
         * =====================================================
         * 3. read(byte[] b, int off, int len)
         * =====================================================
         *
         * b   → array where data will be stored
         * off → starting index in the array
         * len → maximum number of bytes to read
         *
         * Example:
         *
         * read(buffer, 1, 3)
         *
         * Start storing from index 1.
         * Read maximum 3 bytes.
         */

        byte[] buffer2 = new byte[10];

        int count2 = bis.read(buffer2, 2, 4);

        System.out.println("Bytes read: " + count2);

        /*
         * Only print the bytes actually read.
         *
         * Start = off = 2
         * End   = off + count2
         */

        for (int i = 2; i < 2 + count2; i++) {
            System.out.print((char) buffer2[i]);
        }

        System.out.println();


        /*
         * =====================================================
         * 4. skip(long n)
         * =====================================================
         *
         * Skips over bytes without returning them to us.
         *
         * Example:
         *
         * If current position is:
         *
         * A B C D E F G H
         * ↑
         *
         * skip(3)
         *
         * A B C are skipped.
         *
         *              ↑
         *              D
         *
         * The next read() will read D.
         */

        long skipped = bis.skip(3);

        System.out.println("Bytes skipped: " + skipped);


        /*
         * =====================================================
         * 5. available()
         * =====================================================
         *
         * Returns an estimate of the number of bytes that
         * can be read without blocking.
         *
         * It does NOT read the data.
         * It does NOT move the stream position.
         */

        int available = bis.available();

        System.out.println("Available bytes: " + available);


        /*
         * =====================================================
         * 6. mark(int readLimit)
         * =====================================================
         *
         * Marks the current position of the stream.
         *
         * Later we can use reset() to return to this
         * marked position.
         *
         * readLimit tells the stream how many bytes may be
         * read after the mark while still allowing reset().
         */

        bis.mark(100);

        System.out.println("Position marked.");


        /*
         * Read some data after mark.
         */

        int afterMark1 = bis.read();

        System.out.println(
                "After mark: " + (char) afterMark1
        );


        /*
         * =====================================================
         * 7. reset()
         * =====================================================
         *
         * Moves the stream back to the position that was
         * previously marked using mark().
         */

        bis.reset();

        System.out.println("Returned to marked position.");


        /*
         * Read again.
         *
         * This should read the SAME byte that was read
         * immediately after mark().
         */

        int afterReset = bis.read();

        System.out.println(
                "After reset: " + (char) afterReset
        );


        /*
         * =====================================================
         * 8. close()
         * =====================================================
         *
         * Closes BufferedInputStream.
         *
         * It also closes the underlying FileInputStream.
         *
         * After close(), we should not use the stream again.
         */

        bis.close();


        /*
         * IMPORTANT:
         *
         * We don't need:
         *
         *     fis.close();
         *
         * separately.
         *
         * Closing BIS closes the underlying FIS as well.
         */

    }
}