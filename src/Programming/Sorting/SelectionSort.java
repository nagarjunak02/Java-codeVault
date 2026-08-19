package Programming.Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] ar = {4,3,7,1,5,4};
        selectionSort(ar);
    }

    static void selectionSort(int[] ar) {
        for (int i = 0; i< ar.length; i++){
            int minindex = i;

            for (int j = i+1; j< ar.length; j++){
                if(ar[j] < ar[minindex]){
                    minindex = j;
                }
            }
            if(i != minindex){
                int temp = ar[minindex];
                ar[minindex] = ar[i];
                ar[i] = temp;
            }
        }
        System.out.println(Arrays.toString(ar));
    }
}
