package Core.FileHandling.FileInputSream;

import java.io.FileInputStream;

public class MethodsReadByte {
    public static void main(String[] args) {
        try (FileInputStream input = new FileInputStream("C:\\Users\\Nagarjuna\\Music\\Java-codeVault\\Level_1_Basic\\src\\Core\\FileHandling\\abc.txt")){

            byte[] buffer = new byte[6];
            int data;
            while ((data = input.read(buffer) )!=-1){
                for (int i =0; i<data;i++){
                    System.out.print((char)buffer[i]   );

                }
                break;

            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

/*
*
* File:  HI i am Nagarjuna

       ↓ read 4 bytes

Buffer: [H][I][ ][i]
data = 4

       ↓ print

Output: HI i

       ↓ read next 4 bytes

Buffer: [ ][a][m][ ]

data = 4

       ↓ print

Output: HI i am

       ↓ read next 4 bytes
       ↓ print
       ↓
       ↓*/