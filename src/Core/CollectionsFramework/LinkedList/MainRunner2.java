package Core.CollectionsFramework.LinkedList;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class MainRunner2 {
    public static void main(String[] args) {
        LinkedList<Integer> ls = new LinkedList<>();
        ls.add(1);
        ls.add(4);
        ls.add(123);
        ls.add(5);
        ls.add(9);
//        ls.add(null);
        ls.add(78);
        ls.add(65);

        System.out.println(ls);

        Collections.sort(ls,(l1,l2)->l1.compareTo(l2));
        System.out.println(ls);

        Iterator<Integer> li = ls.iterator();
        while (li.hasNext()){
            System.out.println(li.next());
        }
        System.out.println();
        ListIterator<Integer> ll = ls.listIterator(ls.size());
        while (ll.hasPrevious()){
            System.out.println(ll.previous());
        }

        Iterator<Integer> ll2 = ls.listIterator(ls.size());
//        while (ll2.hasPrevious) this methos is not availabell here because the parent does not have these method/
    }
}
