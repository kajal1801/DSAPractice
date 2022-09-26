public class FrogJumpK{
    public int jumpKtimes(int ind, int[] height, int k){
        if(ind == 0){
            return 0;
        }
        int minStep = Integer.MAX_VALUE;
        int step = 0;
        for(int i = 1;i <= k;i++){
            if(ind-i >= 0){
                step = jumpKtimes(ind-i, height, k) + Math.abs(height[ind] - height[ind-i]);
                minStep = Math.min(minStep, step);
            }
            else{
                break;
            }
        }
        return minStep;
    }

    public int frogJump(int[] height, int k){
        return jumpKtimes(height.length-1, height, k);
    }
}

// Memoization
