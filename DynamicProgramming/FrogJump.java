import java.util.* ;

// Memoization
public class FrogJump {
    public static int jump(int n, int[] height, int[] dp){
        if(n == 0){
            return 0;
        }
        if(dp[n] != -1){
            return dp[n];
        }
        int left = 0, right = Integer.MAX_VALUE;
        left = jump(n-1, height, dp) + Math.abs(height[n] - height[n-1]);
        if(n > 1)
            right = jump(n-2, height, dp) + Math.abs(height[n] - height[n-2]);
        
        return dp[n] = Math.min(left, right); 
    }
    public static int frogJump(int n, int heights[]) {

        // Write your code here..
        int[] dp = new int[heights.length];
        Arrays.fill(dp, -1);
        jump(n-1, heights, dp); 
        return dp[n-1];
    }

}

// Tabulation
/*
 public static int frogJump(int n, int heights[]) {
        // Write your code here..
        int[] dp = new int[n];      <---- Define an empty dp array
        dp[0] = 0;                  <---- store base case
        
        for(int i = 1;i < n;i++){
            int left = dp[i-1] + Math.abs(heights[i] - heights[i-1]);    
            int right = Integer.MAX_VALUE;
            if(i > 1){
                right = dp[i-2] + Math.abs(heights[i] - heights[i-2]);
            }
            dp[i] = Math.min(left, right);
        }                           <---- Perform th operation of recursion in loop
        return dp[n-1];
    }
 */

 // Space OPtimization
 /*

 public static int frogJump(int n, int heights[]) {
        int curr = 0;
        int prev = 0;
        int prev2 = 0;
        for(int i = 1;i < n;i++){
            int left = prev + Math.abs(heights[i] - heights[i-1]);
            int right = Integer.MAX_VALUE;
            if(i > 1){
                right = prev2 + Math.abs(heights[i] - heights[i-2]);
            }
            curr = Math.min(left, right);
            prev2 = prev;
            prev = curr;
        }
        return prev;
    }
  */