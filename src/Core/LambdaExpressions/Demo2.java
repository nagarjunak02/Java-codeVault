package Core.LambdaExpressions;

import java.util.Arrays;
import java.util.Comparator;

public class Demo2 {
    public static void main(String[] args) {
        Integer[] ar = {33,32,1,9,8,102};
        Comparator<Integer> dsc = (i1,i2)->(i2.compareTo(i1));
        Arrays.sort(ar,dsc);
        for (Integer a:ar){
            System.out.println(a);
        }


    }
}
