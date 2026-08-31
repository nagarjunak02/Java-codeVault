package Core.FileHandling.CharStream;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderMethods {

    public static void main(String[] args) throws IOException {

        FileReader reader =
                new FileReader("C:\\Users\\Nagarjuna\\Music\\Java-codeVault\\Level_1_Basic\\src\\Core\\FileHandling\\student.txt");


        // =====================================================
        // 1. read()
        // =====================================================
        /*
         * Reads ONE character.
         *
         * Return type is int.
         *
         * Example:
         *
         * File:
         * Hello
         *
         * read()
         *   ↓
         * 'H'
         *
         * -1 means End Of File.
         */

        int data = reader.read();

        System.out.println("read(): " + (char) data);


        // =====================================================
        // 2. read(char[] cbuf)
        // =====================================================
        /*
         * Reads multiple characters into a char array.
         *
         * Suppose next characters are:
         *
         * ello
         *
         * buffer size = 4
         *
         * [e][l][l][o]
         *
         * The method returns the number of characters read.
         */

        char[] buffer = new char[4];

        int count = reader.read(buffer);

        System.out.println("read(char[]): " + new String(buffer));
        System.out.println("Characters read: " + count);


        // =====================================================
        // 3. read(char[] cbuf, int off, int len)
        // =====================================================
        /*
         * Reads characters into a particular portion
         * of the char array.
         *
         * buffer:
         *
         * [ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]
         *       ↑
         *      off = 2
         *
         * len = 5
         *
         * So maximum 5 characters are placed starting
         * from index 2.
         */

        char[] buffer2 = new char[10];

        int count2 = reader.read(buffer2, 2, 5);

        System.out.println(
                "read(char[], off, len): "
                        + new String(buffer2)
        );

        System.out.println("Characters read: " + count2);


        // =====================================================
        // 4. skip(long n)
        // =====================================================
        /*
         * Skips characters from the current position.
         *
         * Suppose current position is:
         *
         * abcdef
         * ↑
         *
         * skip(2)
         *
         * abcdef
         *   ↑
         *
         * Next read starts from 'c'.
         *
         * Returns the actual number of characters skipped.
         */

        long skipped = reader.skip(2);

        System.out.println("Characters skipped: " + skipped);


        // =====================================================
        // 5. ready()
        // =====================================================
        /*
         * Checks whether the reader is ready to be read
         * without blocking.
         *
         * IMPORTANT:
         *
         * ready() != "Is there definitely more data?"
         *
         * It only tells whether reading can proceed
         * without blocking.
         */

        System.out.println("Reader ready: " + reader.ready());


        // =====================================================
        // 6. markSupported()
        // =====================================================
        /*
         * Checks whether this FileReader supports
         * mark() and reset().
         *
         * FileReader returns false.
         */

        System.out.println(
                "Mark supported: "
                        + reader.markSupported()
        );


        // =====================================================
        // 7. mark()
        // =====================================================
        /*
         * FileReader does NOT support marking.
         *
         * Therefore calling mark() results in:
         *
         * IOException
         *
         * We are NOT calling it here.
         *
         * BufferedReader supports mark/reset and we will
         * learn that later.
         */


        // =====================================================
        // 8. reset()
        // =====================================================
        /*
         * Same situation.
         *
         * FileReader does not support mark/reset.
         *
         * We will learn reset() properly with BufferedReader.
         */


        // =====================================================
        // 9. close()
        // =====================================================
        /*
         * Closes the FileReader.
         *
         * Releases the file resource.
         */

        reader.close();

        System.out.println("Reader closed.");
    }
}
