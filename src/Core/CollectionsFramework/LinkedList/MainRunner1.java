package Core.CollectionsFramework.LinkedList;

import Core.Oops.Interface.NoDimondProblem.B;

import java.util.LinkedList;

public class MainRunner1 {
    public static void main(String[] args) {
        LinkedList values = new LinkedList();
        values.add(10);
        values.add(20);
        values.add(15);
        values.add(19.0);
        values.add(134.1);
        values.add("N");
        values.add("ac");
        values.add(null);
        values.add("rama");
        values.add(true);
        values.add('a');
        System.out.println(values);


        //addFirst
        values.addFirst("k");
        //addLast
        values.addLast(12);
        System.out.println(values);

        //removeFirst
        values.removeFirst();
        //removeLast
        values.removeLast();
        System.out.println(values);


        int ic = 0,dc =0,cc =0,sc = 0,nc = 0 ,bc= 0;

        for (Object o:values){
            if(o instanceof Integer){
                ic++;
            } else if (o instanceof Double) {
                dc++;
            }else if(o instanceof String){
                sc++;
            } else if (o instanceof Boolean) {
                bc++;
            } else if (o instanceof Character) {
                cc++;
            } else if (o == null ) {
                nc++;
            }
        }
        System.out.println("Integer : "+ic);
        System.out.println("Double : "+dc);
        System.out.println("Boolean : "+bc);
        System.out.println("Stirng : "+sc);
        System.out.println("Char : "+cc);
        System.out.println("null : "+nc);


    }
}
