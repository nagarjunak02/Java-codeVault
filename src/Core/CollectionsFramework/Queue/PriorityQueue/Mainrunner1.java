package Core.CollectionsFramework.Queue.PriorityQueue;

import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;
//Min-heap to Max-Heap
public class Mainrunner1 {
    public static void main(String[] args) {
        Comparator<Integer> comp = ((o1, o2) -> -(o1.compareTo(o2)));
//        PriorityQueue<Integer>pq = new PriorityQueue<>(comp); --one way
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        pq.offer(40);
        pq.offer(10);
        pq.offer(30);
        pq.offer(20);
        System.out.println(pq);
        System.out.println(pq.poll());

    }
}
