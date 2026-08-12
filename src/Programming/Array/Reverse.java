package Programming.Array;

public class Reverse {
    public static void main(String[] args) {
        int[] x = {1,2,3,4,5};
        revers(x);
        

    }

    private static void revers(int[] x) {
        int[] y = new int[x.length];

        for (int i = 0; i< x.length;i++){
            y[i] = x[x.length-i-1];
        }

        for (int i = 0; i<x.length;i++){
            System.out.println(y[i]);
        }
    }
}
