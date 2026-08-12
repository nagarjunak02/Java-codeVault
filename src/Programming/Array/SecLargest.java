package Programming.Array;


public class SecLargest {
    public static void main(String[] args) {
        int[] arr = {12, 45, 7, 89, 23, 89, 56};

        int first = 0;
        int second = 0;
        for (int i =0; i<arr.length;i++){
            if(arr[i] > first){
                second = first;
                first = arr[i];
            }
        }
        System.out.println(second);
    }
}
