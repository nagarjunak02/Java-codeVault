package Core.CollectionsFramework.ArrayList.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<StudentClass> std = new ArrayList<>();

        boolean loop = true;

        while (loop){
            System.out.println("Enter you choice : \n1.Enter StudentClass Details\n2.Sort StudentClass by id\n3.Sort StudentClass by Percent\n4.Delete\n5.Exit");
            int n = sc.nextInt();
            System.out.println("________________________________________________________________________________________________________");

            switch (n){
                case 1:
                    System.out.println("Enter Name ,id and percent of Student : ");
                    String name = sc.next();
                    int id = sc.nextInt();
                    Double percent = sc.nextDouble();

                    StudentClass student = new StudentClass(name,id,percent);
                    std.add(student);
                    break;

                case 2:
                    if(std.size() == 0){
                        System.out.println("Before sorting please enter Student Details");
                        break;
                    }else{
                        Collections.sort(std,(s1,s2)->s1.getId().compareTo(s2.getId()));
                        System.out.println(std);
                        break;
                    }
                case 3:
                    if(std.size() == 0){
                        System.out.println("Before sorting please enter Student Details");
                        break;
                    }else {
                        Collections.sort(std, (s1, s2) -> s1.getPercent().compareTo(s2.getPercent()));
                        System.out.println(std+"\n");
                        break;
                    }
                case 4:
                    System.out.println("Enter the Student id you want to delete");
                    int idd = sc.nextInt();

                    Iterator<StudentClass> it = std.iterator();
                    while (it.hasNext()){
                        StudentClass s = it.next();
                        if(s.getId() == idd){
                            it.remove();
                            System.out.println("Student deleted successfully");
                            break;
                        }
                    }

                case 5:
                    loop = false;
                    break;

                default:
                    System.out.println("Please enter the valid choice");
            }
            System.out.println("________________Thank You__________________\n");
        }
    }
}
