// Momoization

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

/*
Another Memoized Code:- 

 * int M = 1000000007;
    //Function to count number of ways to reach the nth stair.
    int memo(int n, int[] dp){
        if(n == 0) return 1;
        if(n == 1) return 1;
        if(dp[n] != -1) return dp[n];
        
        return dp[n] = ((memo(n-1, dp) + memo(n-2, dp)) % M);
    }
    int countWays(int n)
    {
        
        // your code here
        int[] dp = new int[n+1];
        Arrays.fill(dp, -1);
        return memo(n, dp);
    }
 */