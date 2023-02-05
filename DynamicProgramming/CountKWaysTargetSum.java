import java.util.Arrays;

public class CountKWaysTargetSum{
    public static int helper(int ind, int target, int[] num, int[][] dp){
        if(ind == num.length -1){
            if(target == 0 && num[ind] == 0){
                return 2;
            }
            if(target == 0 || target == num[ind]){
                return 1;
            }
            return 0;
        }

        if(dp[ind][target] != -1){
            return dp[ind][target];
        }

        int notpick = helper(ind+1, target, num, dp);
        int pick = 0;
        if(target >= num[ind]){
            pick = helper(ind + 1, target - num[ind], num, dp);
        }

        return dp[ind][target] = pick + notpick;
    }
    public static int findWays(int num[], int tar) {
        // Write your code here..
        int[][] dp = new int[num.length][tar+1];
        for(int[] row: dp)
            Arrays.fill(row, -1);
        return helper(0, tar, num, dp);
    }
}