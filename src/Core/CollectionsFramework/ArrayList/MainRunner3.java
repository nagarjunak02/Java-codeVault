package Core.CollectionsFramework.ArrayList;

import java.util.ArrayList;

public class MainRunner3 {
    public static void main(String[] args) {
        ArrayList<Integer> a1 = new ArrayList<>();
        a1.add(23);
        a1.add(20);
        a1.add(98);
        System.out.println(a1);

//        a1.add(100,20); //IndexOutOfBoundException

        //set()
        a1.set(1,1);
        System.out.println(a1);

        //indexOf()
        System.out.println(a1.indexOf(1));

        //contains
        System.out.println(a1.contains(1));

        //get()
        System.out.println(a1.get(2));

        //for loop
        for(int i =0; i<a1.size();i++){
            System.out.println(i+" -> "+a1.get(i));
        }

        a1.add(1);
        System.out.println(a1);

        //last index of
        System.out.println(a1.lastIndexOf(1));

        a1.ensureCapacity(1); //ensureCapacity(int minCapacity) increases the capacity of the internal array (if necessary) so that future additions require fewer resizes.
        System.out.println(a1);

        a1.trimToSize(); //Java creates a new array whose capacity equals the current size.
        System.out.println(a1);

    }
}
