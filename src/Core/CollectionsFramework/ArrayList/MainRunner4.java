package Core.CollectionsFramework.ArrayList;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

public class MainRunner4 {
    public static void main(String[] args) {

        ArrayList<Double> prices = new ArrayList<>();
        prices.add(221.0);
        prices.add(34.0);
        prices.add(21.0);
        prices.add(24.0);
        prices.add(1.0);
        prices.add(30.0);
        prices.add(341.0);
        prices.add(10.0);
        prices.add(91.0);
        prices.add(13.0);
        System.out.println(prices); //[221.0, 34.0, 21.0, 24.0, 1.0, 30.0, 341.0, 10.0, 91.0, 13.0]

        System.out.println("__________________________For Each_______________________________");

        //accessing elements using for each
        for(Double price : prices){
            System.out.println(price);
        }
        System.out.println("__________________________Iterator_______________________________");

        Iterator<Double> it = prices.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println("__________________________Ascending Comparator________________________________");

        //using comparator[Asc]
        Comparator<Double> asc = new Comparator<Double>() {
            @Override
            public int compare(Double p1, Double p2) {
                return p1.compareTo(p2);
            }
        };
        prices.sort(asc);
        System.out.println("Sorting by asc : "+ prices);

        System.out.println("_________________________Descending Comparator________________________________");

        Comparator<Double> dsc = new Comparator<Double>() {
            @Override
            public int compare(Double p1, Double p2) {
                return -(p1.compareTo(p2));
            }
        };

        prices.sort(dsc);
        System.out.println("Sorting by dsc : "+prices);


    }

}
