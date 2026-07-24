package LeetCode;

public class MoveZero {
    public static void main(String[] args) {
        int[] nums = {0,2,3,4,0,5};
        int c = 0;
        for (int i =0;i<nums.length;i++){
            if(nums[i] != 0){
                int temp = nums[i];
                nums[i] = nums[c];
                nums[c] = temp;
                c++;
            }
        }

        for(int i =0; i< nums.length;i++){
            System.out.print(nums[i]);
        }
        System.out.println();

    }
}
