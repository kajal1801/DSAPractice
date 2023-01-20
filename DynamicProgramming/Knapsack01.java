import java.util.Arrays;

public class Knapsack01 
{ 
    //Function to return max value that can be put in knapsack of capacity W.
    static int helper(int i, int W, int[] wt, int[] val, int n, int[][] dp){
        if(i == n){
            return 0;
        }
        if(dp[i][W] != -1){
            return dp[i][W];
        }
        int pick = 0, not_pick = 0;
        if(wt[i] <= W)
            pick = val[i] + helper(i+1, W - wt[i], wt, val, n, dp);
        not_pick = helper(i+1, W, wt, val, n, dp);
        
        return dp[i][W] = Math.max(pick, not_pick);
    }
    static int knapSack(int W, int wt[], int val[], int n) 
    { 
         // your code here 
         int[][] dp = new int[n][W+1];
         for(int i = 0;i < n;i++){
             Arrays.fill(dp[i], -1);
         }
         return helper(0, W, wt, val, n, dp);
         
    } 
}