package Core.FileHandling.CharStream.StudentExample;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Nagarjuna\\Music\\Java-codeVault\\Level_1_Basic\\src\\Core\\FileHandling\\CharStream\\Student.txt"));

        ArrayList<Student> list = new ArrayList<>();
        String line;

        while ((line = br.readLine())!=null){
            String[] values = line.split(",");
            int id = Integer.parseInt(values[0]);
            String name = values[1];

            Student s = new Student(id,name);
            list.add(s);
        }
        System.out.println(list);

    }
}
