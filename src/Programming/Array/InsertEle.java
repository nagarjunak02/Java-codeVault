package Programming.Array;

public class InsertEle {
    public static void main(String[] args) {
        int[] x = {1,2,5,8};
        x = insertEle(x,2,5);
        for (int i = 0; i<x.length;i++){
            System.out.print(x[i]+" ");
        }

    }

    static int[] insertEle(int[] x, int k,int ele) {
        int[] y = new int[x.length+1];

        y[k] = ele;
        for (int  i =0; i<y.length-1;i++){
            if(i < k){
                y[i] = x[i];
            }else{
                y[i+1] = x[i];
            }
        }
        return y;
    }
}
