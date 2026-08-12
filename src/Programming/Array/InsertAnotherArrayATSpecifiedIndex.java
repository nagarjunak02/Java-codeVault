package Programming.Array;

public class InsertAnotherArrayATSpecifiedIndex {
    public static void main(String[] args) {
        int[] x = {1,2,5};
        int[] y = {3,4};

        x = insertArray(x,y,2);
        for (int i = 0; i<x.length;i++){
            System.out.print(x[i]+" ");
        }
    }

    static int[] insertArray(int[] x, int[] y, int k) {
        if(k <0 || k > x.length){
            System.out.println("invalid index");
            return x;
        }
        int[] xy = new int[x.length+y.length];
        for (int i = 0; i<xy.length;i++){
            if(i<k){
                xy[i] = x[i];
            }else if(i < k+y.length){
                xy[i] = y[i-k];
            }else{
                xy[i] = x[i-y.length];
            }
        }
        return xy;
    }
}
