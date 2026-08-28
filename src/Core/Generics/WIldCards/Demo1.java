package Core.Generics.WIldCards;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Demo1 {

    static void printNumber(List<? extends Number>  list){
        for (Number l:list){
            System.out.print(l+" ");
        }
    }

    static void printNumber(Map<Integer,? extends String>  map){
        for (Integer l:map.keySet()){
            System.out.print(l+" ");
        }
    }
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        printNumber(numbers);
        System.out.println();

        Map<Integer,String> map1 = new HashMap<>();
        map1.put(12,"a");
        map1.put(2,"b");
        map1.put(5,"g");
        printNumber(map1);

    }
}
