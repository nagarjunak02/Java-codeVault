package Core.CollectionsFramework.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class MainRunner2 {
    public static void main(String[] args) {
        ArrayList<Integer> ele = new ArrayList<>();
        ele.add(10);
        ele.add(20);
        ele.add(30);

        List<Integer> val = new ArrayList<>();
        val.add(23);
        val.add(20);
        val.add(98);
        System.out.println(val);
        val.add(2,12);
        System.out.println(val.get(1));
        //contains
        System.out.println(val.contains(98));
        ele.trimToSize();
//        val.trimToSize();  this method is not present in list and here ref type is list so we cannot use this method

        //removing by index
        System.out.println(val.remove(0));
        System.out.println(val);

        //removing by value
        System.out.println(val.remove(new Integer(98)));
        System.out.println(val);

        //addAll()
        val.addAll(ele);
        System.out.println(val);

        ele.remove(1);

        //retainAll()
        val.retainAll(ele);
        System.out.println(val);

        //isEmpty()
        System.out.println(val.isEmpty());
        val.clear();
        System.out.println(val);

    }

}
