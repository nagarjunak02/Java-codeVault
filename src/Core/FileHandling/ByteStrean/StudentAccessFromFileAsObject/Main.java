package Core.FileHandling.ByteStrean.StudentAccessFromFileAsObject;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("C:\\Users\\Nagarjuna\\Music\\Java-codeVault\\Level_1_Basic\\src\\Core\\FileHandling\\ByteStrean\\StudentAccessFromFileAsObject\\Student.txt");
        ArrayList<Student> list = new ArrayList<>();

        StringBuilder data = new StringBuilder();
        int ch;

        while ((ch = fis.read())!=-1){
            data.append((char) ch);
        }
        fis.close();
        String[] lines = data.toString().split("\\R");
        for (String line : lines){
            String[] values = line.split(",");
            int id = Integer.parseInt(values[0]);
            String name= values[1];

            Student s = new Student(id,name);
            list.add(s);

        }
        for (Student s : list) {
            System.out.println(s);
        }

    }
}
