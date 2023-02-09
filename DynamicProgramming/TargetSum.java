// Same as Partition into subset with a given difference

import java.util.Arrays;

public class TargetSum {
    public int helper(int index, int nums[], int target, int dp[][]){
        if(index == 0){
            if(target == 0 && nums[0] == 0){
                return 2;
            }
            if(target == 0 || target == nums[index]){
                return 1;
            }
            return 0;
        }
        
        if(dp[index][target] != -1){
            return dp[index][target];
        }
        
        int notpick = helper(index - 1, nums, target, dp);
        int pick = 0;
        if(target >= nums[index]){
            pick = helper(index - 1, nums, target - nums[index], dp);
        }
        
        return dp[index][target] = (pick + notpick);
    }
    public int findTargetSumWays(int[] nums, int target) {
        int totalSum = 0;
        for(int i : nums){
            totalSum += i;
        }
        
        if((totalSum - target) < 0 || (totalSum - target) % 2 != 0){
            return 0;
        }
        int n = nums.length;
        target = (totalSum - target) / 2;
        int[][] dp = new int[n][target+1];
        
        for(int[] row: dp){
            Arrays.fill(row, -1);
        }
        
        return helper(n-1, nums, target, dp);
    }
}
