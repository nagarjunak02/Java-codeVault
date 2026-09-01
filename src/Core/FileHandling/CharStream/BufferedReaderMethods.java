package Core.FileHandling.CharStream;



import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderMethods {

    public static void main(String[] args) throws IOException {

        BufferedReader br =
                new BufferedReader(
                        new FileReader("C:\\Users\\Nagarjuna\\Music\\Java-codeVault\\Level_1_Basic\\src\\Core\\FileHandling\\CharStream\\Student.txt")
                );


        // =====================================================
        // 1. readLine()
        // =====================================================
        /*
         * Reads one complete line from the file.
         *
         * File:
         *
         * Hello Java
         * Welcome Nagarjuna
         * Java Full Stack
         *
         * First call:
         *
         * br.readLine()
         *       ↓
         * "Hello Java"
         *
         * Second call:
         *
         * br.readLine()
         *       ↓
         * "Welcome Nagarjuna"
         */

        String line = br.readLine();

        System.out.println("readLine(): " + line);


        // =====================================================
        // 2. read()
        // =====================================================
        /*
         * Reads ONE character from the current position.
         *
         * We already consumed the first line using readLine().
         *
         * The reader is now positioned at the next line.
         *
         * The next character is:
         *
         * W
         */

        int data = br.read();

        System.out.println("read(): " + (char) data);


        // =====================================================
        // 3. read(char[] buffer)
        // =====================================================
        /*
         * Reads multiple characters into a char array.
         *
         * Suppose the current position is:
         *
         * elcome Nagarjuna
         *
         * buffer size = 7
         *
         * buffer:
         *
         * [e][l][c][o][m][e][ ]
         */

        char[] buffer = new char[7];

        int count = br.read(buffer);

        System.out.println(
                "read(char[]): "
                        + new String(buffer)
        );

        System.out.println(
                "Characters read: " + count
        );


        // =====================================================
        // 4. read(char[] buffer, int off, int len)
        // =====================================================
        /*
         * Reads characters into a specific portion
         * of the character array.
         *
         * buffer size = 15
         *
         * off = 2
         * len = 5
         *
         * So characters are placed starting from index 2.
         */

        char[] buffer2 = new char[15];

        int count2 =
                br.read(buffer2, 2, 5);

        System.out.println(
                "read(char[], off, len): "
                        + new String(buffer2)
        );

        System.out.println(
                "Characters read: " + count2
        );


        // =====================================================
        // 5. skip(long n)
        // =====================================================
        /*
         * Skips characters from the current position.
         *
         * Suppose current position is:
         *
         * Java Full Stack
         * ^
         *
         * skip(5)
         *
         * Java  Full Stack
         *      ^
         *
         * The next read starts from the new position.
         */

        long skipped = br.skip(5);

        System.out.println(
                "Characters skipped: " + skipped
        );


        // =====================================================
        // 6. ready()
        // =====================================================
        /*
         * Checks whether the reader is ready to be read
         * without blocking.
         *
         * It does NOT mean:
         *
         * "There is definitely more data."
         */

        System.out.println(
                "Reader ready: " + br.ready()
        );


        // =====================================================
        // 7. markSupported()
        // =====================================================
        /*
         * Checks whether BufferedReader supports
         * mark() and reset().
         *
         * BufferedReader supports them.
         */

        System.out.println(
                "Mark supported: "
                        + br.markSupported()
        );


        // =====================================================
        // 8. mark(int readAheadLimit)
        // =====================================================
        /*
         * Marks the current position.
         *
         * We allow up to 100 characters to be read
         * while retaining the marked position.
         */

        br.mark(100);

        System.out.println("Position marked.");


        // =====================================================
        // 9. read()
        // =====================================================
        /*
         * Read one character after the mark.
         */

        int first = br.read();

        System.out.println(
                "Character after mark: "
                        + (char) first
        );


        // =====================================================
        // 10. reset()
        // =====================================================
        /*
         * Moves the reader back to the position
         * where mark() was called.
         */

        br.reset();

        System.out.println("Reader reset.");


        // Read again from the marked position

        int again = br.read();

        System.out.println(
                "Character after reset: "
                        + (char) again
        );


        // =====================================================
        // 11. close()
        // =====================================================
        /*
         * Closes BufferedReader.
         *
         * It also closes the underlying FileReader.
         */

        br.close();

        System.out.println("Reader closed.");
    }
}