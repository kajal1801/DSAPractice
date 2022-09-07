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
