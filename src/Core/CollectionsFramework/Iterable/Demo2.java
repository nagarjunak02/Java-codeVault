package Core.CollectionsFramework.Iterable;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");

        Iterator<String> it = list.iterator();
        while (it.hasNext()){
            String value = it.next();
            if(value == "B"){
                it.remove();
            }
        }
        System.out.println(list);

        while (it.hasNext()){
            System.out.println(it.next()); //it prints ntg because  now the iterator has reached the end it cannot be restarted
        }
    }
}
