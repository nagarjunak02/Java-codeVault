package Core.CollectionsFramework.ArrayList;

import java.util.ArrayList;

public class MainRunner1 {
    public static void main(String[] args) {
        ArrayList a1 = new ArrayList();
        a1.add(10);
        a1.add(20);
        a1.add("Apple");
        a1.add(43.0);

        System.out.println("Size of a1 : "+a1.size());
        System.out.println("a1 elements are : " +a1+"\n");

        ArrayList a2 = new ArrayList();
        a2.add(10);
        a2.add(20);
        a2.add("Apple");
        a2.add(43.0);
        a2.add(10);
        a2.add(null);
        a2.add(null);

        System.out.println("Size of a2 : "+a1.size());
        System.out.println("a2 elements are : " +a2+"\n");


        ArrayList a3 = new ArrayList<>(a1);
        System.out.println(a3);


    }
}
