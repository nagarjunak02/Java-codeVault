package Core.CollectionsFramework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionExample1 {
    public static void main(String[] args) {
        Collection<String> list = new ArrayList<>();
        //addFirst()
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        list.add("F");


        System.out.println("After adding elements to list1");
        Iterator<String> it = list.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        Collection<String> list1 = new ArrayList<>();
        list1.addAll(list);
        System.out.println();
        System.out.println("After adding all the elements from list to list1");
        System.out.println(list1);

        System.out.println();

        System.out.println("Removing A from list");
        list.remove("A");
        System.out.println(list);

        System.out.println();

        System.out.println("removing all the ele from list");
        list.removeAll(list);
        System.out.println(list);

        System.out.println();

        System.out.println("Retain All with for-each");
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("");
        list1.retainAll(list);
        for(String s : list1){
            System.out.println(s);
        }

        System.out.println();

        System.out.println("Contain D : "+list.contains("D"));
        System.out.println("Contain all : "+list1.containsAll(list));

        System.out.println();

        System.out.println("Size of list1: "+list1.size());
        System.out.println("Checking is list empty : "+list.isEmpty());
        System.out.println("Check is list equals list1 : "+list.equals(list1));
        System.out.println("hashCode of list: "+list.hashCode());
        System.out.println();
        System.out.println("Clearing the list");
        list.clear();
        System.out.println(list);

        System.out.println();
        Collection<String> temp = new ArrayList<>();

        temp.add("X");

        System.out.println(temp.equals(list));







    }
}
