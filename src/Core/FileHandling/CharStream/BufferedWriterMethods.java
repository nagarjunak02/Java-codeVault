package Core.FileHandling.CharStream;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterMethods {

    public static void main(String[] args) throws IOException {

        /*
         * =====================================================
         * CREATE BufferedWriter
         * =====================================================
         *
         * Flowr
         *
         * Java Program
         *      ↓
         * BufferedWriter
         *      ↓
         * Internal Character Buffer
         *      ↓
         *      ↓
         * Encoding
         *      ↓
         * Bytes
         *      ↓
         * File
         */

        BufferedWriter bw =
                new BufferedWriter(
                        new FileWriter("C:\\Users\\Nagarjuna\\Music\\Java-codeVault\\Level_1_Basic\\src\\Core\\FileHandling\\CharStream\\output.txt")
                );


        // =====================================================
        // 1. write(int)
        // =====================================================

        /*
         * Writes ONE character.
         *
         * 65 represents 'A'.
         *
         * Writer.write(65)
         *      ↓
         *      'A'
         */

        bw.write(65);


        /*
         * Buffer:
         *
         * [A]
         *
         * The data can currently be inside the
         * BufferedWriter's buffer.
         */


        // =====================================================
        // 2. write(char[])
        // =====================================================

        /*
         * Writes an entire character array.
         */

        char[] name = {'N', 'a', 'g', 'a', 'r', 'j', 'u', 'n', 'a'};

        bw.write(name);


        /*
         * Buffer conceptually contains:
         *
         * [A][N][a][g][a][r][j][u][n][a]
         */


        // =====================================================
        // 3. write(char[], off, len)
        // =====================================================

        /*
         * Write only a portion of the array.
         *
         * Array:
         *
         * [J][a][v][a][ ][D][e][v][]
         *
         * off = 5
         * len = 3
         *
         * Therefore:
         *
         * D e v
         */

        char[] language =
                {'J', 'a', 'v', 'a', ' ', 'D', 'e', 'v'};

        bw.write(language, 5, 3);


        // =====================================================
        // 4. write(String)
        // =====================================================

        /*
         * Writes a complete String.
         */

        bw.write(" Java");


        // =====================================================
        // 5. write(String, off, len)
        // =====================================================

        /*
         * String:
         *
         * " FullStack"
         *
         * Index:
         *
         * 0 1 2 3 4 5 6 7 8 9
         *   F u l l S t a c k
         *
         * off = 1
         * len = 4
         *
         * Writes:
         *
         * Full
         */

        bw.write(" FullStack", 1, 4);


        // =====================================================
        // 6. newLine()
        // =====================================================

        /*
         * Writes a platform-specific line separator.
         *
         * After this call, the next write will happen
         * on a new line.
         */

        bw.newLine();


        // =====================================================
        // 7. write(String) after newLine()
        // =====================================================

        bw.write("Second Line");


        // =====================================================
        // 8. flush()
        // =====================================================

        /*
         * flush() pushes all pending characters from
         * BufferedWriter's internal buffer to the
         * underlying FileWriter.
         *
         * Before flush:
         *
         * BufferedWriter
         *       ↓
         * [pending characters]
         *
         * After flush:
         *
         * BufferedWriter
         *       ↓
         * FileWriter
         *       ↓
         * File
         */

        bw.flush();

        System.out.println("Data flushed.");


        // =====================================================
        // 9. close()
        // =====================================================

        /*
         * close():
         *
         * 1. Flushes pending data
         * 2. Closes BufferedWriter
         * 3. Closes underlying FileWriter
         *
         * After close(), don't use bw again.
         */

        bw.close();

        System.out.println("Writer closed.");
    }
}