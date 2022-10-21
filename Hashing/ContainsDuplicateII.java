import java.util.HashMap;

public class ContainsDuplicateII {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        for(int i = 0;i < nums.length;i++){
            if(hashMap.containsKey(nums[i])){
                if(Math.abs(hashMap.get(nums[i])-i) <= k){
                    return true;
                }
            }
            hashMap.put(nums[i], i);
        }
        
        return false;
    }
}
