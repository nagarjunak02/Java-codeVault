package Core.FileHandling.CharStream;


import java.io.FileWriter;
import java.io.IOException;

public class FileWriterMethods {

    public static void main(String[] args) throws IOException {

        /*
         * =====================================================
         * CREATE FileWriter
         * =====================================================
         *
         * FileWriter is a CHARACTER STREAM.
         *
         * Flow:
         *
         * Java characters
         *       ↓
         * FileWriter
         *       ↓
         * Character encoding
         *       ↓
         * Bytes
         *       ↓
         * output.txt
         *
         * false / no append argument means:
         * existing content will be overwritten.
         */

        FileWriter fw = new FileWriter("C:\\Users\\Nagarjuna\\Music\\Java-codeVault\\Level_1_Basic\\src\\Core\\FileHandling\\CharStream\\output.txt");


        // =====================================================
        // 1. write(int)
        // =====================================================

        /*
         * write(int) writes ONE CHARACTER.
         *
         * 65 is the Unicode value of 'A'.
         *
         * IMPORTANT:
         *
         * FileOutputStream.write(65)
         *     → writes byte 65
         *
         * FileWriter.write(65)
         *     → writes character 'A'
         */

        fw.write(65);


        // File now conceptually contains:
        //
        // A


        // =====================================================
        // 2. write(char[])
        // =====================================================

        /*
         * Write an entire character array.
         */

        char[] chars = {'H', 'e', 'l', 'l', 'o'};

        fw.write(chars);


        // File:
        //
        // AHello


        // =====================================================
        // 3. write(char[], off, len)
        // =====================================================

        /*
         * Write only part of the character array.
         *
         * Array:
         *
         * [J][a][v][a][ ][C][o][d][e]
         *  ↑
         *  0
         *
         * off = 5
         * len = 4
         *
         * Therefore:
         *
         * Code
         */

        char[] language = {
                'J', 'a', 'v', 'a',
                ' ', 'C', 'o', 'd', 'e'
        };

        fw.write(language, 5, 4);


        // File:
        //
        // AHelloCode


        // =====================================================
        // 4. write(String)
        // =====================================================

        /*
         * Writes an entire String.
         *
         * This is one of the most commonly used methods.
         */

        fw.write(" Java");


        // File:
        //
        // AHelloCode Java


        // =====================================================
        // 5. write(String, off, len)
        // =====================================================

        /*
         * Writes only part of a String.
         *
         * String:
         *
         * " FullStack"
         *
         * Index:
         *
         *  0 1 2 3 4 5 6 7 8 9
         *  ' ' F u l l S t a c k
         *
         * We want:
         *
         * "Full"
         *
         * start = 1
         * length = 4
         */

        fw.write(" FullStack", 1, 4);


        // File:
        //
        // AHelloCode JavaFull


        // =====================================================
        // 6. append(char)
        // =====================================================

        /*
         * Appends one character.
         */

        fw.append('!');


        // File:
        //
        // AHelloCode JavaFull!


        // =====================================================
        // 7. append(CharSequence)
        // =====================================================

        /*
         * Appends a character sequence.
         *
         * String implements CharSequence.
         */

        fw.append(" Welcome");


        // File:
        //
        // AHelloCode JavaFull! Welcome


        // =====================================================
        // 8. append(CharSequence, start, end)
        // =====================================================

        /*
         * Appends only part of a character sequence.
         *
         * " Nagarjuna"
         *
         * Index:
         *
         * 0 1 2 3 4 5 6 7 8 9
         *   N a g a r j u n a
         *
         * start = 1
         * end = 9
         *
         * end is EXCLUSIVE.
         *
         * Therefore:
         *
         * "Nagarjun"
         */

        fw.append(" Nagarjuna", 1, 9);


        // File:
        //
        // AHelloCode JavaFull! WelcomeNagarjun


        // =====================================================
        // 9. flush()
        // =====================================================

        /*
         * flush() forces pending character data to move
         * through the underlying stream towards the file.
         *
         * Conceptually:
         *
         * Java Program
         *      ↓
         * FileWriter
         *      ↓
         * pending output
         *      ↓
         * flush()
         *      ↓
         * underlying output
         *      ↓
         * output.txt
         */

        fw.flush();

        System.out.println("Data flushed to file.");


        // =====================================================
        // 10. close()
        // =====================================================

        /*
         * close() closes the FileWriter.
         *
         * It also performs the necessary flushing.
         *
         * After close(), we should not use the writer.
         */

        fw.close();

        System.out.println("FileWriter closed.");
    }
}