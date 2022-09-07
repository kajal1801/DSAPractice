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