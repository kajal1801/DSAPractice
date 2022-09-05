import java.util.Arrays;

public class MinCostClimbingStair {
    public int minCostClimbingStairs(int[] cost) {
        int[] dp = new int[cost.length+1];
        Arrays.fill(dp, -1);
        
        int zeroth =  minCost(0, cost, dp);
        int first = minCost(1, cost, dp);
        
        return Math.min(zeroth, first);
    }
    
    public int minCost(int index, int[] cost, int[] dp){
        if(index >= cost.length){
            return 0;
        }
        if(dp[index] != -1){
            return dp[index];
        }
        
        int cost1 = 0, cost2 = 0;
        cost1 = minCost(index+1, cost, dp);
        cost2 = minCost(index+2, cost, dp);
        
        dp[index] = Math.min(cost1, cost2) + cost[index];
        return dp[index];
    }
}
