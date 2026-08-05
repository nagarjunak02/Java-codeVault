package Core.CollectionsFramework.ArrayList;

import java.util.ArrayList;

public class MainRunner2 {
    public static void main(String[] args) {
        ArrayList<Integer> ele = new ArrayList<>();
        ele.add(10);
        ele.add(20);
        ele.add(30);

        ArrayList<Integer> val = new ArrayList<>();
        val.add(23);
        val.add(20);
        val.add(98);
        System.out.println(val);

        //contains
        System.out.println(val.contains(98));

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
