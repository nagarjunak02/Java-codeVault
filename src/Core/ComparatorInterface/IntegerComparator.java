package Core.ComparatorInterface;

import java.util.Comparator;

public class IntegerComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer o1,Integer o2){
        return o1.compareTo(o2);
    }

    public static void main(String[] args) {
        IntegerComparator c = new IntegerComparator();
        System.out.println(c.compare(10,20));
        System.out.println(c.compare(20,20));
        System.out.println(c.compare(20,10));
    }
}
