import java.util.HashMap;

public class ClimbingStairs {
    public int climb(int index, int target, HashMap<Integer, Integer> hashMap){
        if(index == target){
            return 1;
        }
        else if(index > target){
            return 0;
        }
        
        int currentKey = index;
        int one, two;
        
        if(hashMap.containsKey(currentKey)){
            return hashMap.get(currentKey);
        }
        
        one = climb(index+1, target, hashMap);
        two = climb(index+2, target, hashMap);
        
        hashMap.put(currentKey, one+two);
        
        return one+two;
    }
    public int climbStairs(int n) {
        int ans = climb(0, n, new HashMap<Integer, Integer>());
        return ans;
    }
}