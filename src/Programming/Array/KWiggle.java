package Programming.Array;
/*Question: K-Wiggle Subsequence

A sequence is a K-Wiggle sequence if its successive differences strictly alternate between positive and negative, and the absolute value of every successive difference is at least K.

Given an integer array nums and an integer K, return the length of the longest K-Wiggle subsequence.

A sequence of a single element is a valid K-Wiggle sequence of length 1.

A sequence of two elements is valid if their absolute difference is at least K.

Input Format: N (size), array of N integers, integer K.

Output Format: Length of longest K-Wiggle subsequence.*/

public class KWiggle{
    public static void main(String[] args) {
        int[] ar = {1,9,6,9,10};
        int k = 3;
        System.out.println(countSubLength(ar,k));
    }

    private static int countSubLength(int[] ar, int k) {
        int u = 1;
        int d = 1;

        for (int i = 1; i<ar.length;i++){
            if(ar[i]-ar[i-1] >= k)
                u = d+1;
            else if (ar[i-1] - ar[i] >= k) {
                d = u+1;
            }
        }
        return Math.max(u,d);
    }
}
