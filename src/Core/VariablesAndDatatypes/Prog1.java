/*
Q1 Write a program that stores:

Name = Nagarjuna
Age = 21
CGPA = 8.45
Placed = false
Grade = A
using appropriate datatypes and print them.*/

package Core.VariablesAndDatatypes;

public class Prog1 {
    public static void main(String[] args) {
       String  name = "Nagarjuna";
       int age = 21;
       double cgpa = 8.45;
       boolean placed = false;
       char grade = 'A';

        System.out.println(name);
        System.out.println(age);
        System.out.println(cgpa);
        System.out.println(placed);
        System.out.println(grade);

        System.out.println(~10);
        System.out.println(10<<2);
        System.out.println(-20>>>3);
        System.out.println(-20>>3);
    }
}

