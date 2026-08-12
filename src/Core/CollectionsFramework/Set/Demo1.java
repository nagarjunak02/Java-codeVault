package Core.CollectionsFramework.Set;

import java.util.HashSet;
import java.util.Iterator;

public class Demo1 {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();
        hs.add(10);
        hs.add(123);
        hs.add(1);
        hs.add(87);
        hs.add(93);
        hs.add(56);
        hs.add(33);

        Iterator<Integer> i = hs.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }
    }
}
