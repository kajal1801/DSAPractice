import java.util.Arrays;

public class FrogJumpK{
    public int jumpKtimes(int ind, int[] height, int[] dp, int k){
        if(ind == 0){
            return 0;
        }
        if(dp[ind] != -1){
            return dp[ind];
        }
        int minStep = Integer.MAX_VALUE;
        int step = 0;
        for(int i = 1;i <= k;i++){
            if(ind-i >= 0){
                step = jumpKtimes(ind-i, height, dp, k) + Math.abs(height[ind] - height[ind-i]);
                minStep = Math.min(minStep, step);
            }
            else{
                break;
            }
        }
        return dp[ind] = minStep;
    }

    public int frogJump(int[] height, int k){
        int dp[] = new int[height.length];
        Arrays.fill(dp, -1);
        return jumpKtimes(height.length-1, height, dp, k);
    }
}

// Memoization
