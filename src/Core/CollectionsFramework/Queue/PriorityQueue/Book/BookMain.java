package Core.CollectionsFramework.Queue.PriorityQueue.Book;

import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;

public class BookMain {
    public static void main(String[] args) {
        Comparator<Book> pc = ((o1, o2) -> -(o1.getPrice().compareTo(o2.getPrice())));
        PriorityQueue<Book> pq = new PriorityQueue<>(pc);
        pq.offer(new Book(11,"classate",99.0));
        pq.offer(new Book(12,"claste",7.0));
        pq.offer(new Book(1,"booknewe",129.0));
        pq.offer(new Book(121,"raksa",70.0));
        System.out.println(pq);

        Iterator<Book> it = pq.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
     }
}
