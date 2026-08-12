package Programming.Array;

public class FindIndexForTarget {

    public static int[] twoSum(int[] arr,int target){
        int n = arr.length;

        for(int i = 0; i<n; i++){
            for(int j = i+1;j<n;j++){
                if(arr[i]+arr[j] == target){
                    return new int[]{i, j};
                }
            }
        }


        return new int[]{-1,-1};
    }

    public static void main(String[] args) {
        int arr[] = {3,11,15,6};
        int t = 9;
        int res[] = twoSum(arr,t);
        for(int i =0; i<res.length;i++){
            System.out.print(res[i]+" ");
        }
    }
}
