package Programming.Array;

public class DeleteEleWithPos {
    public static void main(String[] args) {
        int[] a = {1, 2, 5, 5 ,8};
        a = deleteElee(a,2);
        for (int i = 0; i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
    static int[] deleteElee(int[] x,int pos){

        if(pos < 0 || pos > x.length) return x;
        int[] y = new int[x.length-1];

        for (int i =0 ;i< y.length;i++){
            if(i<pos){
                y[i] = x[i];
            }else{
                y[i] = x[i+1];
            }
        }
        return y;
    }
}
