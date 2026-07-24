package LeetCode;

public class IncreasingTripletSubsequence {
    public static void main(String[] args) {

        int[] nums = {0, 4, 3, 5, 1, 6};

        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        boolean res = false;

        for (int num : nums) {

            if (num <= first) {
                first = num;
            }
            else if (num <= second) {
                second = num;
            }
            else {
                res = true;
                break;
            }
        }

        System.out.println(res);
    }
}