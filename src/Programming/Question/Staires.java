package Programming.Question;

public class Staires {
    static int countways(int n ){
//        int count =0;
//        if(n<= 3){
//            return n;
//        }
//        return countways(n-1)+countways(n-2);

        int[] dp = new int[n+1];
        dp[1] =1;
        if(n>=2) dp[2] = 2;
        if(n>=3) dp[3] = 3;

        for(int i = 4; i<=dp.length-1;i++){
            dp[i] = dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
    public static void main(String[] args) {
        System.out.println(countways(7));

    }
}
