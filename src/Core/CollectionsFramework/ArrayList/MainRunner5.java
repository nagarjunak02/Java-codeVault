package Core.CollectionsFramework.ArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class MainRunner5 {
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


        //Collection methods

        //max()
        double big = Collections.max(prices);
        System.out.println(big);

        //min
        double small= Collections.min(prices);
        System.out.println(small);

        //Sorting
        //asc soriting using lambda expression
        Collections.sort(prices,(p1,p2)->p1.compareTo(p2));
        System.out.println(prices);

        //dsc sorting using lambda expression
        Collections.sort(prices,(p1,p2)->p2.compareTo(p1));
        System.out.println(prices);
    }
}
