import java.util.Arrays;

public class UnboundedKnapsack {
    public static int helper(int index, int W, int[] val, int[] wt, int[][] dp){
        if(index == 0){
            return val[index] * (W / wt[index]);
        }
        
        if(dp[index][W] != -1){
            return dp[index][W];
        }
        
        int notpick = helper(index - 1, W, val, wt, dp);
        int pick = 0;
        if(W >= wt[index]){
            pick = val[index] + helper(index, W - wt[index], val, wt, dp);
        }
        return dp[index][W] = Math.max(notpick, pick);
    }
    public static int knapSack(int N, int W, int val[], int wt[])
    {
        // code here
        int[][] dp = new int[N][W + 1];
        for(int[] row : dp){
            Arrays.fill(row, -1);
        }
        return helper(N-1, W, val, wt, dp);
        
    }
}
