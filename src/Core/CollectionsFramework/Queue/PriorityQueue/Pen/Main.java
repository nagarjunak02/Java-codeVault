package Core.CollectionsFramework.Queue.PriorityQueue.Pen;

import java.util.Iterator;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        PriorityQueue<Pen> pq = new PriorityQueue<>();
        Pen p1 = new Pen("Red",50.0);
        Pen p2 = new Pen("Blue",500.0);
        Pen p3 = new Pen("Black",10.0);
        Pen p4 = new Pen("Orange",5.0);
        Pen p5 = new Pen("Red",50.0);

        pq.add(p1);
        pq.add(p2);
        pq.add(p3);
        pq.add(p4);
        pq.add(p5);
        pq.add(p1);


        Iterator<Pen> i = pq.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }
        System.out.println(pq.size());
        System.out.println();

        pq.offer(p3);

        for (Pen pen : pq) {
            System.out.println(pen);
        }
        System.out.println(pq.size());
        System.out.println();

        System.out.println(pq.poll());
        System.out.println();
        for (Pen pen : pq) {
            System.out.println(pen);
        }
        System.out.println(pq.size());
        System.out.println();

        System.out.println(pq.remove());
        System.out.println();
        for (Pen pen : pq) {
            System.out.println(pen);
        }
        System.out.println(pq.size());
        System.out.println();

        System.out.println(pq.peek());
        System.out.println();



    }
}
