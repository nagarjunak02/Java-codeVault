package Programming.Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] ar = {5,3,4,1,2,1};
        bubbleSort(ar);

    }

    static void bubbleSort(int[] ar) {
        for (int i =0; i< ar.length;i++){
            boolean swapped = true;

            for (int j = 0; j<ar.length-1-i;j++){
                if(ar[j] > ar[j+1]){
                    int temp = ar[j];
                    ar[j] = ar[j+1];
                    ar[j+1] = temp;
                    swapped = false;
                }
            }
            if(swapped) break;
        }
        System.out.println(Arrays.toString(ar));
    }
}
