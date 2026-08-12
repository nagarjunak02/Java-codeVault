package Programming.Array;

public class CheckDuplicate {
    public static void main(String[] args) {
        int[] x = {1,2,3,4,5};
        int[] y = {1,2,3,4,5};
        boolean res = checkEqual(x,y);
        System.out.println(res);
    }

    static boolean checkEqual(int[] a, int[] b) {
        if(a == b)return true;

        if(a.length != b.length) return false;

        for (int  i = 0 ; i < a.length;i++){
            if(a[i] != b[i])return false;
        }
        return true;
    }
}

