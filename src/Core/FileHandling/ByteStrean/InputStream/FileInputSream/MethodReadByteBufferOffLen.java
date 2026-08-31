package Core.FileHandling.ByteStrean.InputStream.FileInputSream;

import java.io.FileInputStream;

public class MethodReadByteBufferOffLen {
    public static void main(String[] args) {
        try (FileInputStream input = new FileInputStream("C:\\Users\\Nagarjuna\\Music\\Java-codeVault\\Level_1_Basic\\src\\Core\\FileHandling\\abc.txt"))
        {
            byte[] buffer = new byte[10];
            int data;
            while ((data = input.read(buffer,3,4))!= -1){
                for (int i =3; i<3+data;i++){
                    System.out.print((char) buffer[i]);
                }
            }
        }catch (Exception e ){
            e.printStackTrace();
        }
    }
}
/*
 *
 * File:
 * HI i am Nagarjuna
 *
 * Code:
 * byte[] buffer = new byte[10];
 *
 * input.read(buffer, 3, 4);
 *
 * Meaning:
 * buffer → use this array
 * 3      → start storing from index 3
 * 4      → read maximum 4 bytes
 *
 *
 * =========================================================
 * FIRST READ
 * =========================================================
 *
 * File:
 * HI i am Nagarjuna
 * ^^^^
 *
 *          ↓ read 4 bytes
 *
 * Buffer:
 * Index:  0   1   2   3   4   5   6   7   8   9
 *        [0] [0] [0] [H] [I] [ ] [i] [0] [0] [0]
 *                    └─────────────┘
 *                       4 bytes
 *
 * data = 4
 *
 *          ↓ print only indexes 3 to 6
 *
 * Output:
 * HI i
 *
 *
 * =========================================================
 * SECOND READ
 * =========================================================
 *
 * File:
 * HI i am Nagarjuna
 *     ^^^^
 *
 *          ↓ read next 4 bytes
 *
 * Same buffer is reused:
 *
 * Buffer:
 * Index:  0   1   2   3   4   5   6   7   8   9
 *        [0] [0] [0] [ ] [a] [m] [ ] [0] [0] [0]
 *                    └─────────────┘
 *                       4 bytes
 *
 * data = 4
 *
 *          ↓ print indexes 3 to 6
 *
 * Output:
 * HI i am
 *
 *
 * =========================================================
 * THIRD READ
 * =========================================================
 *
 * File:
 * HI i am Nagarjuna
 *         ^^^^
 *
 *          ↓ read next 4 bytes
 *
 * Same buffer is reused again.
 *
 * Buffer:
 * Index:  0   1   2   3   4   5   6   7   8   9
 *        [0] [0] [0] [N] [a] [g] [a] [0] [0] [0]
 *
 * data = 4
 *
 *          ↓ print
 *
 * Output:
 * HI i am Naga
 *
 *
 * =========================================================
 * NEXT READS CONTINUE THE SAME WAY
 * =========================================================
 *
 * Read next 4 bytes
 *       ↓
 * store from index 3
 *       ↓
 * print only the newly read bytes
 *       ↓
 * repeat
 *
 *
 * =========================================================
 * LAST READ
 * =========================================================
 *
 * Eventually only 1 byte remains:
 *
 * File:
 * HI i am Nagarjuna
 *                ^
 *                a
 *
 *          ↓ read
 *
 * Only 1 byte is available.
 *
 * Buffer:
 * Index:  0   1   2   3   4   5   6   7   8   9
 *        [0] [0] [0] [a] [old][old][old] [0] [0] [0]
 *                    ↑
 *                  NEW DATA
 *
 * data = 1
 *
 *          ↓
 *
 * Only buffer[3] is printed.
 *
 * Output:
 * HI i am Nagarjuna
 *
 *
 * =========================================================
 * END OF FILE
 * =========================================================
 *
 * input.read(buffer, 3, 4)
 *          ↓
 *        -1
 *          ↓
 *      while stops
 *
 *
 * IMPORTANT:
 *
 * buffer.length = 10
 *      ↓
 * Total capacity of buffer
 *
 * off = 3
 *      ↓
 * Start storing at index 3
 *
 * len = 4
 *      ↓
 * Read maximum 4 bytes
 *
 * data = actual bytes read
 *      ↓
 * Can be 4, 3, 2, 1...
 * -1 means EOF
 *
 *
 * MEMORY:
 *
 * byte[] buffer = new byte[10]
 *      ↓
 * One array is created in HEAP.
 *
 * The SAME buffer is reused for every read.
 * A new buffer is NOT created every time.
 *
 */