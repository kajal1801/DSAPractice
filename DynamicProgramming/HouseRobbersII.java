import java.util.HashMap;

public class HouseRobbersII{
    public int profit(int index, int n, int[] nums, HashMap<Integer, Integer> memo){
        if(index >= n){
            return 0;
        }
        
        int currentKey = index;
        
        if(memo.containsKey(currentKey)){
            return memo.get(currentKey);
        }
        int alternate1 = profit(index+2, n, nums, memo) + nums[index];
        int alternate2 = profit(index+1, n, nums, memo);
        
        memo.put(currentKey, Math.max(alternate1, alternate2));
        
        return memo.get(currentKey);
    }
    public int rob(int[] nums) {
        int n = nums.length;
        if(n == 1){
            return nums[0];
        }
        HashMap<Integer, Integer> memo = new HashMap<>();
        int take = profit(0, n-1, nums, memo);
        memo.clear();
        int notTake = profit(1, n, nums, memo);
        return Math.max(take, notTake);
    }
}

// Tabulation
/*
public int profit(int[] arr){
    int dp[] = new int[arr.length];
    dp[0] = arr[0];
    for(int i = 1;i < arr.length;i++){
        int pick = arr[i];
        if(i > 1){
            pick += dp[i-2];
        }
        int notpick = 0 + dp[i-1];
        
        dp[i] = Math.max(pick, notpick);
    }
    return dp[arr.length - 1];
}

public int rob(int[] nums) {
    int n = nums.length;
    if(n == 1){
        return nums[0];
    }
    int temp1[] = new int[nums.length - 1];
    int temp2[] = new int[nums.length - 1];
    
    for(int i = 0;i < nums.length;i++){
        if(i == 0){
            temp1[i] = nums[i];
        }
        else if(i == nums.length -1){
            temp2[i-1] = nums[i];
        }
        else{
            temp1[i] = nums[i];
            temp2[i-1] = nums[i];
        }
    }
    return Math.max(profit(temp1), profit(temp2));
}
*/

// Space Optimization
/*
public int profit(int[] arr){
    int prev = 0, prev2 = 0, curr = 0;
    prev = arr[0];
    for(int i = 1;i < arr.length;i++){
        int pick = arr[i];
        if(i > 1){
            pick += prev2;
        }
        int notpick = 0 + prev;
        
        curr = Math.max(pick, notpick);
        prev2 = prev;
        prev = curr;
    }
    return prev;
}

public int rob(int[] nums) {
    int n = nums.length;
    if(n == 1){
        return nums[0];
    }
    int temp1[] = new int[nums.length - 1];
    int temp2[] = new int[nums.length - 1];
    
    for(int i = 0;i < nums.length;i++){
        if(i == 0){
            temp1[i] = nums[i];
        }
        else if(i == nums.length -1){
            temp2[i-1] = nums[i];
        }
        else{
            temp1[i] = nums[i];
            temp2[i-1] = nums[i];
        }
    }
    return Math.max(profit(temp1), profit(temp2));
}
*/