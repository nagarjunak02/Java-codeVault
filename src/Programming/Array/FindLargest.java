package Programming.Array;

public class FindLargest {
    public static void main(String[] args) {
        int[] arr = {12,3,6,12,90};
        System.out.println("Largest is : "+largestNum(arr));
    }

    private static int largestNum(int[] arr) {
        int lar = Integer.MIN_VALUE;


        for (int i =0;i<arr.length;i++){
            if(arr[i] > lar){
                lar = arr[i];
            }
        }
        return lar;
    }
}
