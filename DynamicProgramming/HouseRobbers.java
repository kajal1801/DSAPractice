import java.util.HashMap;

public class HouseRobbers {
    public int rob(int[] nums) {
        HashMap<Integer, Integer> memo = new HashMap<Integer, Integer>();
        return profit(0, nums, memo);
    }
    public int profit(int index, int[] nums, HashMap<Integer, Integer> memo){
        if(index >= nums.length){
            return 0;
        }
        
        int currentKey = index;
        
        if(memo.containsKey(currentKey)){
            return memo.get(currentKey);
        }
        
        int alternate1 = profit(index+2, nums, memo) + nums[index];
        int alternate2 = profit(index+1, nums, memo);
        
        memo.put(currentKey, Math.max(alternate1, alternate2));
        
        return memo.get(currentKey);
    }
}


// Memoization using array
/*
f(ind, dp){
    if(n == 0){
        return nums[0];
    }
    if(n < 0){
        return 0;
    }
    if(dp[n] != -1){
        return dp[n];
    }
    
    int pick = nums[n] + profit(n-2, nums, dp);
    int notpick = 0 + profit(n-1, nums, dp);
    
    return dp[n] = Math.max(pick, notpick);
}
*/

// Tabulation
/*
f(int[] nums) {
    int[] dp = new int[nums.length];
    dp[0] = nums[0];
    for(int i = 1;i < nums.length;i++){
        int pick = nums[i];
        if(i > 1){
            pick += dp[i-2];
        }
        int notpick = 0 + dp[i-1];
        
        dp[i] = Math.max(pick, notpick);
    }
    
    return dp[nums.length - 1];
}
*/

// Space Optimization
/*
public int rob(int[] nums) {
    int prev = nums[0];
    int prev2 = 0, curr = nums[0];
    for(int i = 1;i < nums.length;i++){
        int pick = nums[i];
        if(i > 1){
            pick += prev2;
        }
        int notpick = 0 + prev;
        
        curr = Math.max(pick, notpick);
        prev2 = prev;
        prev = curr;
    }
    
    return curr;
}
*/